package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.VideoDTO;

@Repository
public interface VideosRepository extends CrudRepository<Video, Long> {

	@Join(value = "uploader", type = Join.Type.LEFT_FETCH)
	@Join(value = "viewers", type = Join.Type.LEFT_FETCH)
	@Join(value = "likers", type = Join.Type.LEFT_FETCH)
	@Join(value = "dislikers", type = Join.Type.LEFT_FETCH)
	@Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
	@Override
	Optional<Video> findById(@NotNull Long id);

	Optional<VideoDTO> findOne(long id);
	
	boolean existsByTitle(String title);
	
	Optional<Video> findByTitle(String title);
	
	void deleteByTitle(String title);
}
