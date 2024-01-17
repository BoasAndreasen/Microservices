package uk.ac.york.eng2.videos.cli.videos;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.domain.User;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideosClient {

	@Get("/")
	Iterable<Video> list();

	@Post("/{username}")
	HttpResponse<Void> add(String username, @Body VideoDTO videoDetails);

	@Get("/{id}")
	VideoDTO getVideo(long id);
	
	@Get("/byTitle/{title}")
	VideoDTO getVideoByTitle(String title);

	@Put("/{id}")
	HttpResponse<Void> updateVideo(long id, @Body VideoDTO videoDetails);

	@Delete("/{title}")
	HttpResponse<Void> deleteVideo(String title);

	@Get("/{title}/viewers")
	public Iterable<User> getViewers(String title);

	@Put("/{title}/viewers/{username}")
	public HttpResponse<String> addViewer(String title, String username);	

	@Delete("/{title}/viewers/{username}")
	public HttpResponse<String> removeViewer(String title, String username);
	
	@Get("/{title}/likers")
	public Iterable<User> getLikers(String title);
	
	@Put("/{title}/likers/{username}")
	public HttpResponse<String> addLiker(String title, String username);	
	
	@Delete("/{title}/likers/{username}")
	public HttpResponse<String> removeLiker(String title, String username);
	
	@Get("/{title}/dislikers")
	public Iterable<User> getDislikers(String title);
	
	@Put("/{title}/dislikers/{username}")
	public HttpResponse<String> addDisliker(String title, String username);	
	
	@Delete("/{title}/dislikers/{username}")
	public HttpResponse<String> removeDisliker(String title, String username);
	
	@Get("/{title}/hashtags")
	public Iterable<Hashtag> getHashtags(String title);
	
	@Put("/{title}/hashtags/{name}")
	public HttpResponse<String> addHashtag(String title, String name);	
	
	@Delete("/{title}/hashtags/{name}")
	public HttpResponse<String> removeHashtag(String title, String name);
}
