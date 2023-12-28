package uk.ac.york.eng2.videos.cli.users;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.dto.UserDTO;

@Client("${users.url:`http://localhost:8080/users`}")
public interface UsersClient {

	@Get("/")
	Iterable<User> list();

	@Post("/")
	HttpResponse<Void> add(@Body UserDTO userDetails);

	@Get("/{id}")
	UserDTO getUser(long id);
	
	@Get("/byUsername/{username}")
	UserDTO getUserByUsername(String username);
	
	@Put("/{id}")
	HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails);

	@Delete("/{username}")
	HttpResponse<Void> deleteUser(String username);
	
	@Get("/{username}/uploaded")
	public Iterable<Video> getUploadedVideos(String username);
}
