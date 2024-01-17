package uk.ac.york.eng2.hashtagRecommendation.controllers;

// protected region execute on begin
import jakarta.inject.Inject;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import uk.ac.york.eng2.hashtagRecommendation.domain.Hashtag;
import uk.ac.york.eng2.hashtagRecommendation.dto.HashtagDTO;
import uk.ac.york.eng2.hashtagRecommendation.repositories.HashtagsRepository;

import java.util.ArrayList;
import java.util.List;
// protected region execute end

@Controller("/hashtagRecommendation")
public class HashtagsController {
	
	@Inject
	HashtagsRepository hashtagsRepository;
	
	// protected region execute on begin
	// protected region execute end
	
	// protected region execute on begin
	// protected region execute end
	@Get("/")
	public Iterable<Hashtag> list() {
		// protected region execute on begin
		return hashtagsRepository.findAll();
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{name}")
	public List<HashtagDTO> getTop10AlsoSubscribedHashtag(String name) {
		// protected region execute on begin
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
		// protected region execute end
	}
	
}

