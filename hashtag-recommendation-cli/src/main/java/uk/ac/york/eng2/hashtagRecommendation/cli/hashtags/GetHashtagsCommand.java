package uk.ac.york.eng2.hashtagRecommendation.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.hashtagRecommendation.cli.domain.Hashtag;

@Command(name="get-hashtags", description="Gets all the hashtags", mixinStandardHelpOptions = true)
public class GetHashtagsCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Override
	public void run() {
		for (Hashtag h : client.list()) {
			System.out.println(h);
		}
	}

}
