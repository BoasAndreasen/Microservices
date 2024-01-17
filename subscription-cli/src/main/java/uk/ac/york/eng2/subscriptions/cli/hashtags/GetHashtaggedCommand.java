package uk.ac.york.eng2.subscriptions.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.domain.Video;

@Command(name="get-hashtagged", description="Gets the videos of a hashtag", mixinStandardHelpOptions = true)
public class GetHashtaggedCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		for (Video v : client.getHashtaggedVideos(name)) {
			System.out.println(v);
		}
	}

}
