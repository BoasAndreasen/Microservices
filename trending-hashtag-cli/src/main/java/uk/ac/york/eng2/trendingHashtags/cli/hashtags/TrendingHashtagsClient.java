package uk.ac.york.eng2.trendingHashtags.cli.hashtags;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.trendingHashtags.cli.domain.Hashtag;
import uk.ac.york.eng2.trendingHashtags.cli.dto.HashtagDTO;

@Client("${videos.url:`http://localhost:8081/trendinghashtags`}")
public interface TrendingHashtagsClient {

	@Get("/")
	Iterable<Hashtag> list();
	
	@Get("/topHashtags")
	Iterable<HashtagDTO> listTop10();

}
