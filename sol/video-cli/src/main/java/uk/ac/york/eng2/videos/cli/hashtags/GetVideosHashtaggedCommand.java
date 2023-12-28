package uk.ac.york.eng2.videos.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="get-videos-hashtagged", description="Gets the videos with a specific hashtag", mixinStandardHelpOptions = true)
public class GetVideosHashtaggedCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		Iterable<Video> videos = client.getHashtaggedVideos(name);
		for (Video video : videos) {
			System.out.println(video);
		}
	}
}
