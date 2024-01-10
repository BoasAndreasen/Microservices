package uk.ac.york.eng2.trendingHashtags.controllers;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import uk.ac.york.eng2.trendingHashtags.domain.Hashtag;
import uk.ac.york.eng2.trendingHashtags.dto.HashtagDTO;
import uk.ac.york.eng2.trendingHashtags.repositories.HashtagsRepository;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Controller("/trendinghashtags")
public class HashtagsController {

    @Inject
    HashtagsRepository repo;

    @Get("/")
    public Iterable<Hashtag> list() {
        return repo.findAll();
    }
    
    @Get("/topHashtags")
    public List<HashtagDTO> getTopHashtags() {
        long oneHourAgoMillis = Instant.now().minus(Duration.ofHours(1)).toEpochMilli();

        List<HashtagDTO> list_HashtagDTO = repo.findTop10ByEndMillisGreaterThanOrderByLikeCountDesc(oneHourAgoMillis);

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
