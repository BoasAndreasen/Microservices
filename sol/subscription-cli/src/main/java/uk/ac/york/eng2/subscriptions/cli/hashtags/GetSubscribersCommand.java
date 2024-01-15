package uk.ac.york.eng2.subscriptions.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.domain.User;

@Command(name="get-subscribers", description="Gets the subscribers of a hashtag", mixinStandardHelpOptions = true)
public class GetSubscribersCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		for (User u : client.getSubscribers(name)) {
			System.out.println(u);
		}
	}

}
