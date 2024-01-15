package uk.ac.york.eng2.subscriptions.repositories;

// protected region execute on begin
import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscriptions.domain.User;
import uk.ac.york.eng2.subscriptions.dto.UserDTO;
// protected region execute end

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
	
	// protected region execute on begin
	// protected region execute end
	Optional<UserDTO> findOne(long id);
	
	// protected region execute on begin
	// protected region execute end
	boolean existsByUsername(String username);
	
	// protected region execute on begin
	// protected region execute end
	Optional<User> findByUsername(String username);
	
	// protected region execute on begin
	// protected region execute end
	void deleteByUsername(String username);
	
}


