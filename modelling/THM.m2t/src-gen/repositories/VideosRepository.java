package uk.ac.york.eng2.subscriptions.repositories;

// protected region execute on begin
// protected region execute end

@Repository
public interface VideosRepository extends CrudRepository<Hashtag, Long> {
	
	// protected region execute on begin
	// protected region execute end
	Optional<VideoDTO> findOne(long id);
	
	// protected region execute on begin
	// protected region execute end
	boolean existsByTitle(String title);
	
	// protected region execute on begin
	// protected region execute end
	Optional<Video> findByTitle(String title);
	
	// protected region execute on begin
	// protected region execute end
	void deleteByTitle(String title);
	
}


