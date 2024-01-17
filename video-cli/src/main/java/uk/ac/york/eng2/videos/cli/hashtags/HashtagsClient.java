package uk.ac.york.eng2.videos.cli.hashtags;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;
import uk.ac.york.eng2.videos.cli.domain.Video;
import uk.ac.york.eng2.videos.cli.dto.HashtagDTO;

@Client("${users.url:`http://localhost:8080/hashtags`}")
public interface HashtagsClient {

	@Get("/")
	Iterable<Hashtag> list();

	@Post("/")
	HttpResponse<Void> add(@Body HashtagDTO hashtagDetails);

	@Get("/{id}")
	HashtagDTO getHashtag(long id);
	
	@Get("/byName/{name}")
	HashtagDTO getHashtagByName(String name);

	@Put("/{id}")
	HttpResponse<Void> updateHashtag(long id, @Body HashtagDTO hashtagDetails);

	@Delete("/{name}")
	HttpResponse<Void> deleteHashtag(String name);
	
	@Get("/{name}/hashtagged")
	public Iterable<Video> getHashtaggedVideos(String name);
}
