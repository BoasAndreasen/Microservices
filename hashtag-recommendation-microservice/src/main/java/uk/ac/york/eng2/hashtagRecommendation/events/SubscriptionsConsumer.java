package uk.ac.york.eng2.hashtagRecommendation.events;

// protected region execute on begin
import java.util.HashSet;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import uk.ac.york.eng2.hashtagRecommendation.domain.Hashtag;
import uk.ac.york.eng2.hashtagRecommendation.repositories.HashtagsRepository;
// protected region execute end

@KafkaListener
public class SubscriptionsConsumer {

	@Inject
	HashtagsRepository hashtagsRepository;
	
	
	
	@Topic("hashtag-unsubscribed")
	public void userUnsubscribed(@KafkaKey String title, String hashtagSet) {
		// protected region execute on begin

		ObjectMapper objectmapper = new ObjectMapper();
		try {
			List<String> hashtagList = objectmapper.readValue(hashtagSet, new TypeReference<List<String>>() {});

			HashSet<Hashtag> hashSet = new HashSet<Hashtag>();
			for (String h : hashtagList) {

				Hashtag hashtag = hashtagsRepository.findByNameAndSubscribedHashtag(title, h).orElse(null);

				if (hashtag != null) {
					if (hashtag.getCounter() > 0) {
						hashtag = hashtagsRepository.findByNameAndSubscribedHashtag(title, h).get();
						hashtag.setCounter(hashtag.getCounter()  - 1);
						hashtagsRepository.update(hashtag);
					}

					Hashtag otherHashtag = hashtagsRepository.findByNameAndSubscribedHashtag(h, title).orElse(null);

					if (otherHashtag != null) {
						if (otherHashtag.getCounter() > 0) {
							otherHashtag = hashtagsRepository.findByNameAndSubscribedHashtag(h, title).get();
							otherHashtag.setCounter(otherHashtag.getCounter() - 1);
							hashtagsRepository.update(otherHashtag);
						}
					}
				}
			}
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		// protected region execute end
	}
	@Topic("hashtag-subscribed")
	public void userSubscribed(@KafkaKey String title, String hashtagSet) {
		// protected region execute on begin

		ObjectMapper objectmapper = new ObjectMapper();
		try {
			List<String> hashtagList = objectmapper.readValue(hashtagSet, new TypeReference<List<String>>() {});

			HashSet<Hashtag> hashSet = new HashSet<Hashtag>();
			for (String h : hashtagList) {

				Hashtag hashtag = hashtagsRepository.findByNameAndSubscribedHashtag(title, h).orElse(null);

				if (hashtag != null && !h.equals(title)) {
					hashtag = hashtagsRepository.findByNameAndSubscribedHashtag(title, h).get();
					hashtag.setCounter(hashtag.getCounter() + 1);
					hashtagsRepository.update(hashtag);

					// bidirectional addition
					Hashtag otherHashtag = hashtagsRepository.findByNameAndSubscribedHashtag(h, title).orElse(null);

					if (otherHashtag != null) {
						otherHashtag = hashtagsRepository.findByNameAndSubscribedHashtag(h, title).get();
						otherHashtag.setCounter(otherHashtag.getCounter() + 1);
						hashtagsRepository.update(otherHashtag);
					} else {
						otherHashtag = new Hashtag();
						otherHashtag.setName(h);
						otherHashtag.setSubscribedHashtag(title);
						otherHashtag.setCounter(1);
						hashtagsRepository.save(otherHashtag);
					}
				} else {
					if (!h.equals(title)) {
						hashtag = new Hashtag();
						hashtag.setName(title);
						hashtag.setSubscribedHashtag(h);
						hashtag.setCounter(1);
						hashtagsRepository.save(hashtag);

						// bidirectional addition
						Hashtag otherHashtag = hashtagsRepository.findByNameAndSubscribedHashtag(h, title).orElse(null);

						if (otherHashtag != null) {
							otherHashtag = hashtagsRepository.findByNameAndSubscribedHashtag(h, title).get();
							otherHashtag.setCounter(otherHashtag.getCounter() + 1);
							hashtagsRepository.update(otherHashtag);
						} else {
							otherHashtag = new Hashtag();
							otherHashtag.setName(h);
							otherHashtag.setSubscribedHashtag(title);
							otherHashtag.setCounter(1);
							hashtagsRepository.save(otherHashtag);
						}
					}
				}
				hashSet.add(hashtag);
			}

		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		// protected region execute end
	}
}

