package uk.ac.york.eng2.videos.controllers;

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
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.UserDTO;
import uk.ac.york.eng2.videos.repositories.UsersRepository;

@Controller("/users")
public class UsersController {

	@Inject
	UsersRepository repo;

	@Get("/")
	public Iterable<User> list() {
		return repo.findAll();
	}

	@Post("/")
	public HttpResponse<Void> add(@Body UserDTO userDetails) {
		if (repo.existsByUsername(userDetails.getUsername())) {
			return HttpResponse.status(HttpStatus.CONFLICT, "User with username " + userDetails.getUsername() + " already exists.");
		} else {
			User user = new User();
			user.setUsername(userDetails.getUsername());
			repo.save(user);
			return HttpResponse.created(URI.create("/users/" + user.getId()));
		}
	}

	@Get("/{id}")
	public UserDTO getUser(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Get("/byUsername/{username}")
	public User getUserByUsername(String username) {
		return repo.findByUsername(username).orElse(null);
	}

	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails) {
		Optional<User> user = repo.findById(id);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		User u = user.get();
		if (userDetails.getUsername() != null) {
			u.setUsername(userDetails.getUsername());
		}
		repo.save(u);
		return HttpResponse.ok();
	}

	@Transactional
	@Delete("/{username}")
	public HttpResponse<Void> deleteUser(String username) {
		Optional<User> user = repo.findByUsername(username);
		if (user.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(user.get());
		return HttpResponse.ok();
	}

	@Transactional
	@Get("/{username}/uploaded")
	public Iterable<Video> getUploaded(String username) {
		Optional<User> oUser = repo.findByUsername(username);
		if (oUser.isEmpty()) {
			return null;
		}
		return oUser.get().getUploadedVideos();
	}
	
}
