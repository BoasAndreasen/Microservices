package uk.ac.york.eng2.trendingHashtags.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.trendingHashtags.cli.domain.Hashtag;

@Command(name="get-10trendingHashtags", description="Gets top 10 trending hashtags", mixinStandardHelpOptions = true)
public class Get10TrendingHashtagsCommand implements Runnable {

	@Inject
	private TrendingHashtagsClient client;

	@Override
	public void run() {
		for (Hashtag h : client.listTop10()) {
			System.out.println(h);
		}
	}
}
