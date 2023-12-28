package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="add-video-liker", description="Adds a liker to a video", mixinStandardHelpOptions = true)
public class AddVideoLikerCommand implements Runnable {
	
	@Inject
	private VideosClient client;

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private String username;

	@Override
	public void run() {
		HttpResponse<String> response = client.addLiker(title, username);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
	}

}
