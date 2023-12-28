package uk.ac.york.eng2.books.cli.users;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.books.cli.dto.UserDTO;

@Command(name="update-user", description="Updates a book", mixinStandardHelpOptions = true)
public class UpdateUserCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Option(names = {"-u", "--username"}, description="Username of the user")
	private String username;

	@Inject
	private UsersClient client;

	@Override
	public void run() {
		UserDTO userDetails = new UserDTO();
		if (username != null) {
			userDetails.setUsername(username);
		}
		
		HttpResponse<Void> response = client.updateUser(id, userDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}
