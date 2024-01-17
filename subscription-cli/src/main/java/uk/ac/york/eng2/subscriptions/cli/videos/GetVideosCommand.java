package uk.ac.york.eng2.subscriptions.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import uk.ac.york.eng2.subscriptions.cli.domain.Video;

@Command(name="get-videos", description="Gets all the videos", mixinStandardHelpOptions = true)
public class GetVideosCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Override
	public void run() {
		for (Video v : client.list()) {
			System.out.println(v);
		}
	}

}
