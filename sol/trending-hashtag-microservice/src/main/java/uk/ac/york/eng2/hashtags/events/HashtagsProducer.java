package uk.ac.york.eng2.hashtags.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface HashtagsProducer {

	/*
	 * NOTE: this topic has to be created before we start the program, or we will
	 * have an error from Kafka Streams.
	 */
	String TOPIC_LIKED = "video-liked";
	String TOPIC_TOP_10_LIKED_HASHTAGS = "top-10-liked-hashtags";

	@Topic(TOPIC_TOP_10_LIKED_HASHTAGS)
	void readBook(@KafkaKey Long id);

}
