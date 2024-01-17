package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.dto.UserDTO;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {

	Optional<UserDTO> findOne(long id);
	
	boolean existsByUsername(String username);
	
	Optional<User> findByUsername(String username);
	
	void deleteByUsername(String username);

}
