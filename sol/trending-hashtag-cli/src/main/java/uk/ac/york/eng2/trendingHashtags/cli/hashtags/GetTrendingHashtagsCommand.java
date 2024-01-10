package uk.ac.york.eng2.trendingHashtags.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.trendingHashtags.cli.domain.Hashtag;

@Command(name="get-trendingHashtags", description="Gets all the trending hashtags", mixinStandardHelpOptions = true)
public class GetTrendingHashtagsCommand implements Runnable {

	@Inject
	private TrendingHashtagsClient client;

	@Override
	public void run() {
		for (Hashtag h : client.list()) {
			System.out.println(h);
		}
	}

}
