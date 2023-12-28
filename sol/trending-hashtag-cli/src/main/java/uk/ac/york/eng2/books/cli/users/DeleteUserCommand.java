package uk.ac.york.eng2.books.cli.users;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-user", description="Deletes a user", mixinStandardHelpOptions = true)
public class DeleteUserCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Inject
	private UsersClient client;

	@Override
	public void run() {
		HttpResponse<Void> response = client.deleteUser(id);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
