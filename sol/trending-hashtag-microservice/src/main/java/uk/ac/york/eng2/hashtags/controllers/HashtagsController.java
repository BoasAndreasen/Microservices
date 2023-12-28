package uk.ac.york.eng2.hashtags.controllers;

import java.net.URI;
import java.util.Optional;

import javax.transaction.Transactional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import uk.ac.york.eng2.hashtags.domain.Hashtag;
import uk.ac.york.eng2.hashtags.dto.HashtagDTO;
import uk.ac.york.eng2.hashtags.repositories.HashtagsRepository;

@Controller("/hashtags")
public class HashtagsController {
	
	@Inject
	HashtagsRepository repo;

	@Get("/")
	public Iterable<Hashtag> list() {
		return repo.findAll();
	}
	
	@Post("/")
	public HttpResponse<Void> add(@Body HashtagDTO hashtagDetails) {
		Hashtag hashtag = new Hashtag();
		hashtag.setName(hashtagDetails.getName());
		repo.save(hashtag);
		return HttpResponse.created(URI.create("/hashtags/" + hashtag.getId()));
	}

	@Get("/{id}")
	public HashtagDTO getHashtag(long id) {
		return repo.findOne(id).orElse(null);
	}
	
	@Transactional
	@Put("/{id}")
	public HttpResponse<Void> updateHashtag(long id, @Body HashtagDTO hashtagDetails) {
		Optional<Hashtag> hashtag = repo.findById(id);
		if (hashtag.isEmpty()) {
			return HttpResponse.notFound();
		}

		Hashtag h = hashtag.get();
		if (hashtagDetails.getName() != null) {
			h.setName(hashtagDetails.getName());
		}
		repo.save(h);
		return HttpResponse.ok();
	}
	
	@Transactional
	@Delete("/{id}")
	public HttpResponse<Void> deleteHashtag(long id) {
		Optional<Hashtag> hashtag = repo.findById(id);
		if (hashtag.isEmpty()) {
			return HttpResponse.notFound();
		}

		repo.delete(hashtag.get());
		return HttpResponse.ok();
	}
}
