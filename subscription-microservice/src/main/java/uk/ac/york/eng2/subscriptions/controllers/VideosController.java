package uk.ac.york.eng2.subscriptions.controllers;

// protected region execute on begin
import java.net.URI;
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
import uk.ac.york.eng2.subscriptions.domain.Video;
import uk.ac.york.eng2.subscriptions.dto.VideoDTO;
import uk.ac.york.eng2.subscriptions.repositories.VideosRepository;
// protected region execute end

@Controller("/subscriptionVideos")
public class VideosController {
	
	@Inject
	VideosRepository videosRepository;
	
	// protected region execute on begin
	// protected region execute end
	
	// protected region execute on begin
	// protected region execute end
	@Get("/")
	public Iterable<Video> list() {
		// protected region execute on begin
		return videosRepository.findAll();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails) {
		// protected region execute on begin
		if (videosRepository.existsByTitle(videoDetails.getTitle())) {
			return HttpResponse.status(HttpStatus.CONFLICT, "Video with title " + videoDetails.getTitle() + " already exists.");
		} else {
		    Video video = new Video();
		    video.setTitle(videoDetails.getTitle());
			video.setViews(videoDetails.getViews());

			videosRepository.save(video);

		    return HttpResponse.created(URI.create("/videos/" + video.getId()));
		}
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{id}")
	public VideoDTO getVideo(long id) {
		// protected region execute on begin
		return videosRepository.findOne(id).orElse(null);
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/byName/{title}/id")
	public long getVideoidByName(String title) {
		// protected region execute on begin
		return videosRepository.findByTitle(title).orElse(null).getId();
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Put("/{id}")
	public HttpResponse<Void>  updateVideo(long id, @Body VideoDTO videoDetails) {
		// protected region execute on begin
		Optional<Video> video = videosRepository.findById(id);
		if (video.isEmpty()) {
			return HttpResponse.notFound();
		}

		Video v = video.get();
		if (videoDetails.getTitle() != null) {
			v.setTitle(videoDetails.getTitle());
		}

		videosRepository.update(v);
		return HttpResponse.ok();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Delete("/{title}")
	public HttpResponse<Void> deleteVideo(String title) {
		// protected region execute on begin
		Optional<Video> video = videosRepository.findByTitle(title);
		if (video.isEmpty()) {
			return HttpResponse.notFound();
		}

		videosRepository.delete(video.get());
		return HttpResponse.ok();
		// protected region execute end
	}
	
}

