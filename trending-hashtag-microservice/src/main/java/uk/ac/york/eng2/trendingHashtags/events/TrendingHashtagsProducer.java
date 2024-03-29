package uk.ac.york.eng2.trendingHashtags.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface TrendingHashtagsProducer {

	String TOPIC_LIKED = "video-liked";

	@Topic(TOPIC_LIKED)
	void videoLiked(@KafkaKey String title, String s);

	@Topic(TrendingHashtagsStreams.TOPIC_LIKED_BY_DAY)
	void videoLikedMetric(@KafkaKey WindowedIdentifier window, Long count);

}
