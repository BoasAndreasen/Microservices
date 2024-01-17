package uk.ac.york.eng2.subscriptions.events;

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
import uk.ac.york.eng2.subscriptions.domain.Hashtag;
import uk.ac.york.eng2.subscriptions.domain.Video;
import uk.ac.york.eng2.subscriptions.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscriptions.repositories.VideosRepository;
// protected region execute end

@KafkaListener
public class VideosConsumer {

	@Inject
	VideosRepository videosRepository;
	
	@Inject
	HashtagsRepository hashtagsRepository;
	
	
	
	@Topic("video-watched")
	public void watchedVideo(@KafkaKey String title, String hashtagSet) {
		// protected region execute on begin

		Video video = videosRepository.findByTitle(title).orElse(null);

		if (video != null) {
			video.setViews(video.getViews() + 1);
			videosRepository.update(video);
		} else {
			video = new Video();
			video.setTitle(title);
			video.setViews(1);
			
			ObjectMapper objectmapper = new ObjectMapper();
			try {
		        List<String> hashtagList = objectmapper.readValue(hashtagSet, new TypeReference<List<String>>() {});
		        
		        HashSet<Hashtag> hashSet = new HashSet<Hashtag>();
		        for (String h : hashtagList) {
		        	
		        	Hashtag hashtag;

	                if (hashtagsRepository.existsByName(h)) {

		                hashtag = hashtagsRepository.findByName(h).get();

		                
	                } else {
			        	hashtag = new Hashtag();
			        	hashtag.setName(h);
			        	
	                }
	                hashSet.add(hashtag);
		        }
		        

		        video.setHashtags(hashSet);	
		        
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
			videosRepository.save(video);
			
		}
		// protected region execute end
	}
}

