package uk.ac.york.eng2.subscriptions.cli.hashtags;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="add-subscriber", description="Adds a hashtag", mixinStandardHelpOptions = true)
public class AddSubscriberCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Parameters(index="1")
	private String username;

	@Override
	public void run() {
		HttpResponse<String> response = client.addSubscriber(name, username);
		System.out.printf("Server responded with status %s: %s%n",
				response.getStatus(), response.getBody().orElse("(no text)"));
	}
}
