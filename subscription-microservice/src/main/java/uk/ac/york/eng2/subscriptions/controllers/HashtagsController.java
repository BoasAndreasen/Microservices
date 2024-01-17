package uk.ac.york.eng2.subscriptions.controllers;

import jakarta.inject.Inject;
import uk.ac.york.eng2.subscriptions.events.SubscriptionsProducer;

// protected region execute on begin
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.subscriptions.domain.Hashtag;
import uk.ac.york.eng2.subscriptions.domain.User;
import uk.ac.york.eng2.subscriptions.domain.Video;
import uk.ac.york.eng2.subscriptions.dto.HashtagDTO;
import uk.ac.york.eng2.subscriptions.events.SubscriptionsProducer;
import uk.ac.york.eng2.subscriptions.repositories.HashtagsRepository;
import uk.ac.york.eng2.subscriptions.repositories.UsersRepository;
// protected region execute end

@Controller("/subscriptionHashtags")
public class HashtagsController {
	
	@Inject
	HashtagsRepository hashtagsRepository;
	
	@Inject
	UsersRepository usersRepository;
	
	// protected region execute on begin
	@Inject
	SubscriptionsProducer subscriptionsProducer;
	// protected region execute end
	
	// protected region execute on begin
	// protected region execute end
	@Get("/")
	public Iterable<Hashtag>  list() {
		// protected region execute on begin
		return hashtagsRepository.findAll();
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Post("/")
	public HttpResponse<Void> add(@Body HashtagDTO hashtagDetails) {
		// protected region execute on begin
		if (hashtagsRepository.existsByName(hashtagDetails.getName())) {
			return HttpResponse.status(HttpStatus.CONFLICT, "User with name " + hashtagDetails.getName() + " already exists.");
		} else {
			Hashtag hashtag = new Hashtag();
			hashtag.setName(hashtagDetails.getName());
			hashtagsRepository.save(hashtag);
			return HttpResponse.created(URI.create("/hashtags/" + hashtag.getId()));
		}
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{id}")
	public HashtagDTO getHashtag(long id) {
		// protected region execute on begin
		return hashtagsRepository.findOne(id).orElse(null);
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/byName/{name}")
	public Hashtag getHashtagByName(String name) {
		// protected region execute on begin
		return hashtagsRepository.findByName(name).orElse(null);
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Put("/{id}")
	public HttpResponse<Void> updateHashtag(long id, @Body HashtagDTO hashtagDetails) {
		// protected region execute on begin
		Optional<Hashtag> hashtag = hashtagsRepository.findById(id);
		if (hashtag.isEmpty()) {
			return HttpResponse.notFound();
		}

		Hashtag h = hashtag.get();
		if (hashtagDetails.getName() != null) {
			h.setName(hashtagDetails.getName());
		}
		hashtagsRepository.save(h);
		return HttpResponse.ok();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Delete("/{name}")
	public HttpResponse<Void> deleteHashtag(String name) {
		// protected region execute on begin
		Optional<Hashtag> hashtag = hashtagsRepository.findByName(name);
		if (hashtag.isEmpty()) {
			return HttpResponse.notFound();
		}

		hashtagsRepository.delete(hashtag.get());
		return HttpResponse.ok();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Get("/{name}/subscribers")
	public Iterable<User> getSubscriber(String name) {
		// protected region execute on begin
		Optional<Hashtag> oHashtag = hashtagsRepository.findByName(name);
		if (oHashtag.isEmpty()) {
			return null;
		}
		return oHashtag.get().getSubscribedUsers();
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Put("/{name}/subscribers/{username}")
	public HttpResponse<String> addSubscriber(String name, String username) {
		// protected region execute on begin
		Optional<Hashtag> oHashtag = hashtagsRepository.findByName(name);
		if (oHashtag.isEmpty()) {
			return HttpResponse.notFound(String.format("Hashtag %s not found", name));
		}

		Optional<User> oUser = usersRepository.findByUsername(username);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %s not found", username));
		}

		Hashtag hashtag = oHashtag.get();
		if (hashtag.getSubscribedUsers().add(oUser.get())) {
			hashtagsRepository.update(hashtag);
		}
		
		// Subscribed event with current hashtag as key and all hashtags as value
    	HashSet<String> hashtagSet = new HashSet<>();
		for (Hashtag h: oUser.get().getSubscribedHashtags()) {
			hashtagSet.add(h.getName());
		}
		
		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("999");
		try {
			String s = objectMapper.writeValueAsString(hashtagSet);
			subscriptionsProducer.userSubscribed(name,s);
			System.out.println("999");
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	    

		return HttpResponse.ok(String.format("User %s added as subscriber of hashtag %s", name, username));
		// protected region execute end
	}
	
	// protected region execute on begin
	@Transactional
	// protected region execute end
	@Delete("/{name}/subscribers/{username}")
	public HttpResponse<String> removeSubscriber(String name, String username) {
		// protected region execute on begin
		Optional<Hashtag> oHashtag = hashtagsRepository.findByName(name);
		if (oHashtag.isEmpty()) {
			return HttpResponse.notFound(String.format("Hashtag %s not found", name));
		}

		Optional<User> oUser = usersRepository.findByUsername(username);
		if (oUser.isEmpty()) {
			return HttpResponse.notFound(String.format("User %s not found", username));
		}

		/*
		 * DELETE should be idempotent, so it's OK if the mentioned
		 * user was not a subscriber of the hashtag.
		 */
		Hashtag hashtag = oHashtag.get();
		hashtag.getSubscribedUsers().removeIf(u -> username.equals(u.getUsername()));
		hashtagsRepository.update(hashtag);
		
		// Unsubscribed event with current hashtag as key and all hashtags as value
    	HashSet<String> hashtagSet = new HashSet<>();
		for (Hashtag h: oUser.get().getSubscribedHashtags()) {
			hashtagSet.add(h.getName());
		}
		
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String s = objectMapper.writeValueAsString(hashtagSet);
			subscriptionsProducer.userUnsubscribed(name,s);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		return HttpResponse.ok();
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{name}/hashtagged")
	public Iterable<Video> getHashtaggedVideos(String name) {
		// protected region execute on begin
		Optional<Hashtag> oHashtag = hashtagsRepository.findByName(name);
		if (oHashtag.isEmpty()) {
			return null;
		}
		return oHashtag.get().getHashtaggedVideos();
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{name}/hashtagged/topTen")
	public Iterable<Video> getSortedHashtaggedVideos(String name) {
		// protected region execute on begin
		Optional<Hashtag> oHashtag = hashtagsRepository.findByName(name);
		if (oHashtag.isEmpty()) {
			return null;
		}
		Iterable<Video> hashtaggedVideos = oHashtag.get().getHashtaggedVideos();
		
		List<Video> list = new ArrayList<Video>();
		
		for (Video v : hashtaggedVideos) {
			list.add(v);
		}
		
		Collections.sort(list, (o1, o2) -> Long.compare(o1.getViews(), o2.getViews()));
		
		Iterable<Video> topTenByViews = list.subList(0, Math.min(list.size(), 10));
		
		
		return topTenByViews;
		// protected region execute end
	}
	
}

