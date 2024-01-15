package uk.ac.york.eng2.subscriptions.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.dto.UserDTO;

@Command(name="get-user-by-username", description="Gets a specific user by username", mixinStandardHelpOptions = true)
public class GetUserByUsernameCommand implements Runnable {

	@Inject
	private UsersClient client;

	@Parameters(index="0")
	private String username;

	@Override
	public void run() {
		UserDTO user = client.getUserByUsername(username);
		if (user == null) {
			System.err.println("User not found!");
			System.exit(1);
		} else {
			System.out.println(user);
		}
	}

	
}
