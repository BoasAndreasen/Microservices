package uk.ac.york.eng2.hashtagRecommendation.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.hashtagRecommendation.cli.dto.HashtagDTO;

@Command(name="get-ten-other-hashtags", description="Gets the top 10 hashtags also subscribed to by name", mixinStandardHelpOptions = true)
public class GetHashtagByNameCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		HashtagDTO hashtag = client.getTop10AlsoSubscribedHashtag(name);
		if (hashtag == null) {
			System.err.println("Hashtag not found!");
			System.exit(1);
		} else {
			System.out.println(hashtag);
		}
	}
}
