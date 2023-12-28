package uk.ac.york.eng2.videos.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface VideosProducer {
	
	String TOPIC_POSTED = "video-posted";
	
	String TOPIC_WATCHED = "video-watched";
	
	String TOPIC_LIKED = "video-liked";
	
	String TOPIC_DISLIKED = "video-disliked";
		
	@Topic(TOPIC_POSTED)
	void postedVideo(@KafkaKey String title, String hashtags);
	
	@Topic(TOPIC_WATCHED)
	void watchedVideo(@KafkaKey String title, String hashtags);
	
	@Topic(TOPIC_LIKED)
	void likedVideo(@KafkaKey String title, String hashtags);
	
	@Topic(TOPIC_DISLIKED)
	void dislikedVideo(@KafkaKey String title, String hashtags);

}
