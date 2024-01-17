package uk.ac.york.eng2.subscriptions.cli.users;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.subscriptions.cli.domain.Hashtag;
import uk.ac.york.eng2.subscriptions.cli.domain.User;
import uk.ac.york.eng2.subscriptions.cli.domain.Video;
import uk.ac.york.eng2.subscriptions.cli.dto.UserDTO;

@Client("${users.url:`http://localhost:8082/subscriptionUsers`}")
public interface UsersClient {

	@Get("/")
	Iterable<User> list();

	@Post("/")
	HttpResponse<Void> add(@Body UserDTO userDetails);

	@Get("/{id}")
	UserDTO getUser(long id);
	
	@Get("/byUsername/{username}")
	UserDTO getUserByUsername(String username);
	
	@Delete("/{username}")
	HttpResponse<Void> deleteUser(String username);
	
	@Get("/{username}/subscribed")
	Iterable<Hashtag> getSubscribedHashtags(String username);
	
	@Get("/{username}/topTenVideosUsingSubscribedHashtags")
	public Iterable<Video> topTenVideosUsingSubscribedHashtags(String username);

}
