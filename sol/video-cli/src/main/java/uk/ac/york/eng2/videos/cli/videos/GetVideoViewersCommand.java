package uk.ac.york.eng2.videos.cli.videos;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.User;

@Command(name="get-video-viewers", description="Gets the viewers of a specific video", mixinStandardHelpOptions = true)
public class GetVideoViewersCommand implements Runnable {

	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String title;

	@Override
	public void run() {
		Iterable<User> users = client.getViewers(title);
		for (User user : users) {
			System.out.println(user);
		}
	}
}
