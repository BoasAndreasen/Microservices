package uk.ac.york.eng2.subscriptions.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.dto.HashtagDTO;

@Command(name="get-hashtag", description="Gets a specific hashtag", mixinStandardHelpOptions = true)
public class GetHashtagCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private long id;

	@Override
	public void run() {
		HashtagDTO hashtag = client.getHashtag(id);
		if (hashtag == null) {
			System.err.println("Hashtag not found!");
			System.exit(1);
		} else {
			System.out.println(hashtag);
		}
	}
}
