package uk.ac.york.eng2.subscriptions.controllers;

// protected region execute on begin
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscriptions.domain.Hashtag;
import uk.ac.york.eng2.subscriptions.domain.User;
import uk.ac.york.eng2.subscriptions.domain.Video;
import uk.ac.york.eng2.subscriptions.dto.UserDTO;
import uk.ac.york.eng2.subscriptions.repositories.UsersRepository;
// protected region execute end

@Controller("/subscriptionUsers")
public class UsersController {
	
	@Inject
	UsersRepository usersRepository;
	
	// protected region execute on begin
	// protected region execute end
	
	// protected region execute on begin
	// protected region execute end
	@Get("/")
	public Iterable<User> list() {
		// protected region execute on begin
		return usersRepository.findAll();
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Post("/")
	public HttpResponse<Void> add(@Body UserDTO userDetails) {
		// protected region execute on begin
		if (usersRepository.existsByUsername(userDetails.getUsername())) {
			return HttpResponse.status(HttpStatus.CONFLICT, "User with username " + userDetails.getUsername() + " already exists.");
		} else {
			User user = new User();
			user.setUsername(userDetails.getUsername());
			usersRepository.save(user);
			return HttpResponse.created(URI.create("/users/" + user.getId()));
		}
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{id}")
	public UserDTO getUser(long id) {
		// protected region execute on begin
		return usersRepository.findOne(id).orElse(null);
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/byUsername/{username}")
	public User getUserByUsername(String username) {
		// protected region execute on begin
		return usersRepository.findByUsername(username).orElse(null);
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Put("/{id}")
	public HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails) {
		// protected region execute on begin
		Optional<User> user = usersRepository.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		User u = user.get();
		if (userDetails.getUsername() != null) {
			u.setUsername(userDetails.getUsername());
		}
		usersRepository.save(u);
		return HttpResponse.ok();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Delete("/{username}")
	public HttpResponse<Void> deleteUser(String username) {
		// protected region execute on begin
		Optional<User> user = usersRepository.findByUsername(username);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		usersRepository.delete(user.get());
		return HttpResponse.ok();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Get("/{username}/subscribedHashtags")
	public Iterable<Hashtag> getSubscribedHashtags(String username) {
		// protected region execute on begin
		Optional<User> oUser = usersRepository.findByUsername(username);
		if (oUser.isEmpty()) {
			return null;
		}
		return oUser.get().getSubscribedHashtags();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Get("/{username}/topTenVideosUsingSubscribedHashtags")
	public Iterable<Video> topTenVideosUsingSubscribedHashtags(String username) {
		// protected region execute on begin
		Optional<User> oUser = usersRepository.findByUsername(username);
		if (oUser.isEmpty()) {
			return null;
		}
		
		// All videos using subscribed hashtag that user has subscribed to
		HashSet<Video> allVideos = new HashSet<Video>();

		Iterable<Hashtag> subscribedHashtags = oUser.get().getSubscribedHashtags();

		for (Hashtag h: subscribedHashtags) {
			Iterable<Video> hashtaggedVideos = h.getHashtaggedVideos();
			
			for (Video v: hashtaggedVideos) {
				allVideos.add(v);

				/**
				 * 	// Filter out watched videos
				 * 	System.out.println(videosClient.getViewersDTO("title1"));
		
				boolean viewed = false;	
				 * // Do not add if username is a viewer of video
				for (UserDTO u : videosClient.getViewersDTO(v.getTitle())) {
					
					System.out.println(u);
					System.out.println(u.getUsername());
					
					if (u.getUsername() == username) {
						viewed = true;
					}
				}
				
				if (!viewed) {
					allVideos.add(v);
				}
				 */

			}
		}
		
		List<Video> allVideosList = new ArrayList<Video>(allVideos);

		Collections.sort(allVideosList, (o1, o2) -> Long.compare(o1.getViews(), o2.getViews()));
		
		Iterable<Video> topTenByViews = allVideosList.subList(0, Math.min(allVideosList.size(), 10));
		
		return topTenByViews;
		// protected region execute end
	}
	
}

