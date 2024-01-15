package uk.ac.york.eng2.hashtagRecommendation.controllers;

import jakarta.inject.Inject;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import uk.ac.york.eng2.hashtagRecommendation.domain.Hashtag;
import uk.ac.york.eng2.hashtagRecommendation.dto.HashtagDTO;
import uk.ac.york.eng2.hashtagRecommendation.events.SubscriptionsProducer;
import uk.ac.york.eng2.hashtagRecommendation.repositories.HashtagsRepository;

import java.util.ArrayList;
import java.util.List;

@Controller("/subscriptionHashtags")
public class HashtagsController {
	
	@Inject
	HashtagsRepository hashtagsRepository;

	@Get("/")
	public Iterable<Hashtag>  list() {
		return hashtagsRepository.findAll();
	}

	@Get("/{name}")
	public List<HashtagDTO> getTop10AlsoSubscribedHashtag(String name) {
		List<HashtagDTO> list_HashtagDTO = hashtagsRepository.findByNameOrderByCounterDesc(name);

		List<HashtagDTO> tenHashtags = new ArrayList<>();
		int counter = 0;
		for (HashtagDTO h : list_HashtagDTO) {
			tenHashtags.add(h);

			if (counter >= 9) {
				break;
			}
			counter += 1;
		}

		return tenHashtags;
	}
}

