package uk.ac.york.eng2.hashtagRecommendation.cli.hashtags;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.hashtagRecommendation.cli.domain.Hashtag;
import uk.ac.york.eng2.hashtagRecommendation.cli.dto.HashtagDTO;

@Client("${users.url:`http://localhost:8083/subscriptionHashtags`}")
public interface HashtagsClient {

	@Get("/")
	Iterable<Hashtag> list();

	@Get("/{name}")
	HashtagDTO getTop10AlsoSubscribedHashtag(String name);

}
