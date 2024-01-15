package uk.ac.york.eng2.subscriptions.events;

// protected region execute on begin
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
// protected region execute end

@KafkaClient
public interface SubscriptionsProducer {
	
	@Topic("hashtag-unsubscribed")
	void userUnsubscribed(@KafkaKey String username, String hashtag);
	
	@Topic("hashtag-subscribed")
	void userSubscribed(@KafkaKey String subscribedHashtag, String hashtag);
	
}

