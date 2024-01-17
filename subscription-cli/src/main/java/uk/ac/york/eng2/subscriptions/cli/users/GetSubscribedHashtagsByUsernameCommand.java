package uk.ac.york.eng2.subscriptions.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.domain.Hashtag;

@Command(name="get-hashtags-by-username", description="Gets subscribed hashtags by username", mixinStandardHelpOptions = true)
public class GetSubscribedHashtagsByUsernameCommand implements Runnable {

	@Inject
	private UsersClient client;

	@Parameters(index="0")
	private String username;

	@Override
	public void run() {
		Iterable<Hashtag> hashtags = client.getSubscribedHashtags(username);
		for (Hashtag hashtag : hashtags) {
			System.out.println(hashtag);
		}
	}

	
}
