package uk.ac.york.eng2.videos.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.dto.VideoDTO;
import uk.ac.york.eng2.videos.events.VideosProducer;
import uk.ac.york.eng2.videos.repositories.HashtagsRepository;
import uk.ac.york.eng2.videos.repositories.UsersRepository;
import uk.ac.york.eng2.videos.repositories.VideosRepository;

@Controller("/videos")
public class VideosController {

	@Inject
	VideosRepository repo;

	@Inject
	UsersRepository userRepo;
	
	@Inject
	HashtagsRepository hashtagRepo;
	
	@Inject
	VideosProducer videosProducer;

	@Get("/")
	public Iterable<Video> list() {
		return repo.findAll();
	}

	@Transactional
	@Post("/{username}")
	public HttpResponse<Void> add(String username, @Body VideoDTO videoDetails) {
		if (repo.existsByTitle(videoDetails.getTitle())) {
			return HttpResponse.status(HttpStatus.CONFLICT, "Video with title " + videoDetails.getTitle() + " already exists.");
		} else {
		    Video video = new Video();
		    video.setTitle(videoDetails.getTitle());

		    User user = userRepo.findByUsername(username)
		            .orElseThrow(() -> new EntityNotFoundException("User not found with username: " + username));

		    video.setUploader(user);
		    repo.save(video);
		    
		    // Posted event
		    if (video.getHashtags() == null) {
		    	// no hashtags
		    	videosProducer.postedVideo(video.getTitle(), "[]");
		    } else {
		    	HashSet<String> hashtagSet = new HashSet<>();
				for (Hashtag h: video.getHashtags()) {
					hashtagSet.add(h.getName());
				}
				
				ObjectMapper objectMapper = new ObjectMapper();
				try {
					String s = objectMapper.writeValueAsString(hashtagSet);
					videosProducer.postedVideo(video.getTitle(),s);
					
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
		    }
			
		    return HttpResponse.created(URI.create("/videos/" + video.getId()));
		}
	}
	
	@Get("/{id}")
	public VideoDTO getVideo(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Get("/byName/{title}/id")
	public long getVideoidByName(String title) {
		return repo.findByTitle(title).orElse(null).getId();
	}

	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateVideo(long id, @Body VideoDTO videoDetails) {
		Optional<Video> video = repo.findById(id);
		if (video.isEmpty()) {
			return HttpResponse.notFound();
		}

		Video v = video.get();
		if (videoDetails.getTitle() != null) {
			v.setTitle(videoDetails.getTitle());
		}
		if (videoDetails.getUploader() != null) {
			v.setUploader(videoDetails.getUploader());
		}
		repo.update(v);
		return HttpResponse.ok();
	}

	@Transactional
	@Delete("/{title}")
	public HttpResponse<Void> deleteVideo(String title) {
		Optional<Video> video = repo.findByTitle(title);
		if (video.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(video.get());
		return HttpResponse.ok();
	}

	@Transactional
	@Get("/{title}/viewers")
	public Iterable<User> getViewers(String title) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return null;
		}
		return oVideo.get().getViewers();
	}
	
	@Transactional
	@Get("/{title}/viewersDTO")
	public Iterable<UserDTO> getViewersDTO(String title) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return null;
		}
		
		Iterable<User> users = oVideo.get().getViewers();
		
		ArrayList<UserDTO> usersDTO = new ArrayList<UserDTO>();
		
		for (User user : users) {
			UserDTO userDTO = new UserDTO();
			userDTO.setUsername(user.getUsername());
			usersDTO.add(userDTO);
		}
		return usersDTO;
	}

	@Transactional
	@Put("/{title}/viewers/{username}")
	public HttpResponse<String> addViewer(String title, String username) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		Optional<User> oUser = userRepo.findByUsername(username);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %s not found", username));
		}

		
		Video video = oVideo.get();
		if (video.getViewers().add(oUser.get())) {
			repo.update(video);

			// Watched event
		    if (video.getHashtags() == null) {
		    	// no hashtags
		    	videosProducer.watchedVideo(title, "[]");
		    } else {
				HashSet<String> hashtagSet = new HashSet<>();
				for (Hashtag h: video.getHashtags()) {
					hashtagSet.add(h.getName());
				}
				
				ObjectMapper objectMapper = new ObjectMapper();
				try {
					String s = objectMapper.writeValueAsString(hashtagSet);
					videosProducer.watchedVideo(title, s);
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
		    }
		}
		
		return HttpResponse.ok(String.format("User %s added as viewer of video %s", title, username));
	}

	@Transactional
	@Delete("/{title}/viewers/{username}")
	public HttpResponse<String> removeViewer(String title, String username) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		/*
		 * DELETE should be idempotent, so it's OK if the mentioned
		 * user was not a viewer of the video.
		 */ 
		Video video = oVideo.get();
		video.getViewers().removeIf(u -> username.equals(u.getUsername()));
		repo.update(video);

		return HttpResponse.ok();
	}
	
	@Transactional
	@Get("/{title}/likers")
	public Iterable<User> getLikers(String title) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return null;
		}
		return oVideo.get().getLikers();
	}
	
	@Transactional
	@Put("/{title}/likers/{username}")
	public HttpResponse<String> addLiker(String title, String username) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		Optional<User> oUser = userRepo.findByUsername(username);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %s not found", username));
		}
		
		Video video = oVideo.get();
		if (video.getLikers().add(oUser.get())) {
			repo.update(video);

		    if (video.getHashtags() == null) {
		    	// no hashtags
		    	videosProducer.likedVideo(title, "[]");
		    } else {
				HashSet<String> hashtagSet = new HashSet<>();
				for (Hashtag h: video.getHashtags()) {
					hashtagSet.add(h.getName());
				}
				
				ObjectMapper objectMapper = new ObjectMapper();
				try {
					String s = objectMapper.writeValueAsString(hashtagSet);
					// Liked event
					videosProducer.likedVideo(title, s);
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
		    }
		}

		return HttpResponse.ok(String.format("User %s added as liker of video %s", username, title));
	}
	
	@Transactional
	@Delete("/{title}/likers/{username}")
	public HttpResponse<String> removeLiker(String title, String username) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		Video video = oVideo.get();
		video.getLikers().removeIf(u -> username.equals(u.getUsername()));
		repo.update(video);

		return HttpResponse.ok();
	}
	
	@Transactional
	@Get("/{title}/dislikers")
	public Iterable<User> getDislikers(String title) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return null;
		}
		return oVideo.get().getDislikers();
	}
	
	@Transactional
	@Put("/{title}/dislikers/{username}")
	public HttpResponse<String> addDisliker(String title, String username) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		Optional<User> oUser = userRepo.findByUsername(username);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %s not found", username));
		}

		Video video = oVideo.get();
		if (video.getDislikers().add(oUser.get())) {
			repo.update(video);
			
			// Disliked event
		    if (video.getHashtags() == null) {
		    	// no hashtags
		    	videosProducer.dislikedVideo(title, "[]");
		    } else {
				HashSet<String> hashtagSet = new HashSet<>();
				for (Hashtag h: video.getHashtags()) {
					hashtagSet.add(h.getName());
				}
				
				ObjectMapper objectMapper = new ObjectMapper();
				try {
					String s = objectMapper.writeValueAsString(hashtagSet);
					videosProducer.dislikedVideo(title, s);
				} catch (JsonProcessingException e) {
					e.printStackTrace();
				}
		    }			
		}
		return HttpResponse.ok(String.format("User %s added as disliker of video %s", username, title));
	}
	
	
	@Transactional
	@Delete("/{title}/dislikers/{username}")
	public HttpResponse<String> removeDisliker(String title, String username) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		Video video = oVideo.get();
		video.getDislikers().removeIf(u -> username.equals(u.getUsername()));
		repo.update(video);

		return HttpResponse.ok();
	}
	
	@Transactional
	@Get("/{title}/hashtags")
	public Iterable<Hashtag> getHashtags(String title) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return null;
		}
		return oVideo.get().getHashtags();
	}
	
	@Transactional
	@Put("/{title}/hashtags/{name}")
	public HttpResponse<String> addHashtag(String title, String name) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		Optional<Hashtag> oHashtag = hashtagRepo.findByName(name);
		if (oHashtag.isEmpty()) {
			return HttpResponse.notFound(String.format("Hashtag %s not found", name));
		}

		// video hashtags
		Video video = oVideo.get();
		if (video.getHashtags().add(oHashtag.get())) {
			repo.update(video);
		}
		
		return HttpResponse.ok(String.format("Hashtag %s added as hashtag of video %s", name, title));
	}
	
	@Transactional
	@Delete("/{title}/hashtags/{name}")
	public HttpResponse<String> removeHashtag(String title, String name) {
		Optional<Video> oVideo = repo.findByTitle(title);
		if (oVideo.isEmpty()) {
			return HttpResponse.notFound(String.format("Video %s not found", title));
		}

		Video video = oVideo.get();
		video.getHashtags().removeIf(h -> name.equals(h.getName()));
		repo.update(video);

		return HttpResponse.ok();
	}
}
