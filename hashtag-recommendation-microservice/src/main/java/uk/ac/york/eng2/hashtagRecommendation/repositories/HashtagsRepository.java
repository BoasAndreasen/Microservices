package uk.ac.york.eng2.hashtagRecommendation.repositories;

// protected region execute on begin
import java.util.List;
import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.hashtagRecommendation.domain.Hashtag;
import uk.ac.york.eng2.hashtagRecommendation.dto.HashtagDTO;
// protected region execute end

@Repository
public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {
	
	// protected region execute on begin
	// protected region execute end
	List<HashtagDTO> findByNameOrderByCounterDesc(String name);
	
	// protected region execute on begin
	// protected region execute end
	Optional<Hashtag> findByNameAndSubscribedHashtag(String name, String subscribedHashtag);
	
}


