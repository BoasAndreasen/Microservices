package uk.ac.york.eng2.subscriptions.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.domain.Video;

@Command(name="get-top-ten-by-username", description="Gets top ten viewed videos for hashtags subscribed to by username", mixinStandardHelpOptions = true)
public class GetTopTenVideosByUsernameCommand implements Runnable {

	@Inject
	private UsersClient client;

	@Parameters(index="0")
	private String username;

	@Override
	public void run() {
		Iterable<Video> videos = client.topTenVideosUsingSubscribedHashtags(username);
		for (Video video : videos) {
			System.out.println(video);
		}
	}	
}
