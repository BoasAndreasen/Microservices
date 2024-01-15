package uk.ac.york.eng2.hashtagRecommendation.repositories;

import java.util.List;
import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.hashtagRecommendation.domain.Hashtag;
import uk.ac.york.eng2.hashtagRecommendation.dto.HashtagDTO;

@Repository
public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {

	List<HashtagDTO> findByNameOrderByCounterDesc(String name);

	Optional<Hashtag> findByNameAndSubscribedHashtag(String name, String subscribedHashtag);

}


