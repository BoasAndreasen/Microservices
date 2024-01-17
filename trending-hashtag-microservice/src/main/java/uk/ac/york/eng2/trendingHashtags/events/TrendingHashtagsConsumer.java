package uk.ac.york.eng2.trendingHashtags.events;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trendingHashtags.domain.Hashtag;
import uk.ac.york.eng2.trendingHashtags.repositories.HashtagsRepository;

@KafkaListener(groupId = "trendingHashtags-debug")
public class TrendingHashtagsConsumer {

	@Inject
	HashtagsRepository repo;

	@Topic(TrendingHashtagsStreams.TOPIC_LIKED_BY_DAY)
	public void hashtagMetric(@KafkaKey WindowedIdentifier window, Long count) {
		System.out.println("New value for key " + window.toString() + " count: " + count);

		Hashtag hashtag = new Hashtag();
		hashtag.setName(window.getName());
		hashtag.setStartMillis(window.getStartMillis());
		hashtag.setEndMillis(window.getEndMillis());
		hashtag.setLikeCount(count);
		repo.save(hashtag);
	}

	@Topic(TrendingHashtagsProducer.TOPIC_LIKED)
	public void videoLiked(@KafkaKey String id, String video) {
		System.out.printf("Video liked: %s%n", id, video);
	}
}
