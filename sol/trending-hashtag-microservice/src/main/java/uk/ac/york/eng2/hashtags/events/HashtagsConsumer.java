package uk.ac.york.eng2.hashtags.events;

import java.util.List;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.hashtags.controllers.VideosClient;
import uk.ac.york.eng2.hashtags.domain.Hashtag;


@KafkaListener
public class HashtagsConsumer {

    private final VideosClient videosClient;

    @Inject
    public HashtagsConsumer(VideosClient videosClient) {
        this.videosClient = videosClient;
    }

	@Topic(HashtagsProducer.TOPIC_LIKED)
	public void likedVideo(@KafkaKey long id, String title) {
		System.out.println("Video " + id + " liked. Title: " + title);
		
		List<Hashtag> hList = videosClient.getHashtagsForVideo(id);
		
		System.out.println(hList);

        //HttpResponse<List<Hashtag>> rsp = client.toBlocking().exchange("", Argument.listOf(Hashtag.class));
        //System.out.println(rsp.body());
		
		//for (Hashtag h : hashtags) {
		//	System.out.println(h.getName());
		//}

	}
}
