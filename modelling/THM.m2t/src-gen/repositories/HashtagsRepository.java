package uk.ac.york.eng2.subscriptions.repositories;

// protected region execute on begin
// protected region execute end

@Repository
public interface HashtagsRepository extends CrudRepository<Hashtag, Long> {
	
	// protected region execute on begin
	// protected region execute end
	Optional<HashtagDTO> findOne(long id);
	
	// protected region execute on begin
	// protected region execute end
	boolean existsByName(String name);
	
	// protected region execute on begin
	// protected region execute end
	Optional<Hashtag> findByName(String name);
	
	// protected region execute on begin
	// protected region execute end
	void deleteByName(String name);
	
}


