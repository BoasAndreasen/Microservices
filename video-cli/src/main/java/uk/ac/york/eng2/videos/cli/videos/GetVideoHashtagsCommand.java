package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Hashtag;

@Command(name="get-video-hashtags", description="Gets the hashtags of a specific video", mixinStandardHelpOptions = true)
public class GetVideoHashtagsCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String title;

	@Override
	public void run() {
		Iterable<Hashtag> hashtags = client.getHashtags(title);
		for (Hashtag hashtag : hashtags) {
			System.out.println(hashtag);
		}
	}
}

