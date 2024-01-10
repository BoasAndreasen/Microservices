package uk.ac.york.eng2.trendingHashtags.repositories;

import java.util.List;
import java.util.Optional;

import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.trendingHashtags.domain.Hashtag;
import uk.ac.york.eng2.trendingHashtags.dto.HashtagDTO;


@Repository
public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {

    Optional<HashtagDTO> findOne(long id);

    Optional<Hashtag> findByName(String name);
    
    boolean existsByName(String name);
    

    @Query("SELECT new uk.ac.york.eng2.trendingHashtags.dto.HashtagDTO(h.name, MAX(h.likeCount)) " +
            "FROM Hashtag h " +
            "WHERE h.endMillis > :oneHourAgoMillis " +
            "GROUP BY h.name " +
            "ORDER BY MAX(h.likeCount) DESC")
    List<HashtagDTO> findTop10ByEndMillisGreaterThanOrderByLikeCountDesc(long oneHourAgoMillis);

}
