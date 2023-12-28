package uk.ac.york.eng2.books.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.books.cli.dto.UserDTO;

@Command(name="get-user", description="Gets a specific user", mixinStandardHelpOptions = true)
public class GetUserCommand implements Runnable {

	@Inject
	private UsersClient client;

	@Parameters(index="0")
	private Long id;

	@Override
	public void run() {
		UserDTO user = client.getUser(id);
		if (user == null) {
			System.err.println("User not found!");
			System.exit(1);
		} else {
			System.out.println(user);
		}
	}

	
}
