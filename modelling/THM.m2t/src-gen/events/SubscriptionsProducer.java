package uk.ac.york.eng2.subscriptions.events;

// protected region execute on begin
// protected region execute end

@KafkaClient
public interface SubscriptionsProducer {
	
	@Topic("hashtag-unsubscribed")
	void userUnsubscribed(@KafkaKey String username, String hashtag);
	
	@Topic("hashtag-subscribed")
	void userSubscribed(@KafkaKey String subscribedHashtag, String hashtag);
	
}

