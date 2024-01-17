package uk.ac.york.eng2.hashtagRecommendation.cli.hashtags;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.hashtagRecommendation.cli.domain.Hashtag;
import uk.ac.york.eng2.hashtagRecommendation.cli.dto.HashtagDTO;

@Client("${users.url:`http://localhost:8083/hashtagRecommendation`}")
public interface HashtagsClient {

	@Get("/")
	Iterable<Hashtag> list();

	@Get("/{name}")
	Iterable<HashtagDTO> getTop10AlsoSubscribedHashtag(String name);

}
