package uk.ac.york.eng2.videos.events;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener
public class VideosConsumer {
	
	@Topic(VideosProducer.TOPIC_POSTED)
	public void postedVideo(@KafkaKey String title, String hashtagSet) {
		String hashtags = "";
		ObjectMapper objectmapper = new ObjectMapper();
		try {
	        List<String> hashtagList = objectmapper.readValue(hashtagSet, new TypeReference<List<String>>() {});
	        hashtags = String.join(", ", hashtagList);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("Video " + title + " posted. Hashtags: " + hashtags);
	}

	@Topic(VideosProducer.TOPIC_WATCHED)
	public void watchedVideo(@KafkaKey String title, String hashtagSet) {
		String hashtags = "";
		ObjectMapper objectmapper = new ObjectMapper();
		try {
	        List<String> hashtagList = objectmapper.readValue(hashtagSet, new TypeReference<List<String>>() {});
	        hashtags = String.join(", ", hashtagList);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("Video " + title + " watched. Hashtags: " + hashtags);
	}
	
	@Topic(VideosProducer.TOPIC_LIKED)
	public void likedVideo(@KafkaKey String title, String hashtagSet) {		
		String hashtags = "";
		ObjectMapper objectmapper = new ObjectMapper();
		try {
	        List<String> hashtagList = objectmapper.readValue(hashtagSet, new TypeReference<List<String>>() {});
	        hashtags = String.join(", ", hashtagList);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("Video " + title + " liked. Hashtags: " + hashtags);
	}
	
	@Topic(VideosProducer.TOPIC_DISLIKED)
	public void dislikedVideo(@KafkaKey String title, String hashtagSet) {
		String hashtags = "";
		ObjectMapper objectmapper = new ObjectMapper();
		try {
	        List<String> hashtagList = objectmapper.readValue(hashtagSet, new TypeReference<List<String>>() {});
	        hashtags = String.join(", ", hashtagList);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println("Video " + title + " disliked. Hashtags: " + hashtags);
	}
}
