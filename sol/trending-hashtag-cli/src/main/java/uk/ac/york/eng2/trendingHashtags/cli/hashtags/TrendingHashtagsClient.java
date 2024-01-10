package uk.ac.york.eng2.trendingHashtags.cli.hashtags;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.trendingHashtags.cli.domain.Hashtag;

@Client("${trendingHashtags.url:`http://localhost:8080/trendingHashtags`}")
public interface TrendingHashtagsClient {

	@Get("/")
	Iterable<Hashtag> list();
	
	@Get("/topHashtags")
	Iterable<Hashtag> listTop10();

}
