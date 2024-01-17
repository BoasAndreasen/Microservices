package uk.ac.york.eng2.subscriptions.cli.videos;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import uk.ac.york.eng2.subscriptions.cli.domain.Video;
import uk.ac.york.eng2.subscriptions.cli.dto.VideoDTO;

@Client("${subscriptions.url:`http://localhost:8082/subscriptionVideos`}")
public interface VideosClient {

	@Get("/")
	Iterable<Video> list();

	@Get("/{id}")
	VideoDTO getVideo(long id);
	
	@Get("/byTitle/{title}")
	VideoDTO getVideoByTitle(String title);
}
