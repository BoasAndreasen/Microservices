package uk.ac.york.eng2.videos.cli.users;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.domain.Video;

@Command(name="get-videos-uploaded", description="Gets the videos of a specific user", mixinStandardHelpOptions = true)
public class GetVideosUploadedCommand implements Runnable {

	@Inject
	private UsersClient client;

	@Parameters(index="0")
	private String username;

	@Override
	public void run() {
		Iterable<Video> videos = client.getUploadedVideos(username);
		for (Video video : videos) {
			System.out.println(video);
		}
	}
}
