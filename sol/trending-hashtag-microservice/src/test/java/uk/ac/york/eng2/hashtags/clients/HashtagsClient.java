package uk.ac.york.eng2.hashtags.clients;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.hashtags.domain.Hashtag;
import uk.ac.york.eng2.hashtags.dto.HashtagDTO;

@Client("/trendingHashtags")
public interface HashtagsClient {

	@Get("/")
	Iterable<Hashtag> list();

	@Post("/")
	HttpResponse<Void> add(@Body HashtagDTO bookDetails);

	@Get("/{id}")
	HashtagDTO getBook(long id);

	@Put("/{id}")
	HttpResponse<Void> updateBook(long id, @Body HashtagDTO bookDetails);

	@Delete("/{id}")
	HttpResponse<Void> deleteBook(long id);
}
