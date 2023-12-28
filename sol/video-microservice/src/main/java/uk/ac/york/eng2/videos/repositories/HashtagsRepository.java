package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.Hashtag;
import uk.ac.york.eng2.videos.dto.HashtagDTO;

@Repository
public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {

	Optional<HashtagDTO> findOne(long id);

	boolean existsByName(String name);
	
	Optional<Hashtag> findByName(String name);
	
	void deleteByName(String name);
}
