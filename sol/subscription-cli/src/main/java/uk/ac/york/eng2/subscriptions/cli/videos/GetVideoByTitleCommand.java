package uk.ac.york.eng2.subscriptions.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.dto.VideoDTO;

@Command(name="get-video-by-title", description="Gets a specific video by title", mixinStandardHelpOptions = true)
public class GetVideoByTitleCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String title;

	@Override
	public void run() {
		VideoDTO video = client.getVideoByTitle(title);
		if (video == null) {
			System.err.println("Video not found!");
			System.exit(1);
		} else {
			System.out.println(video);
		}
	}
}
