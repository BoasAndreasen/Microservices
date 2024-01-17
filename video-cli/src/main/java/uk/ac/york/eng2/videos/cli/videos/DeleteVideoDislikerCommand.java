package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-video-disliker", description="Deletes a disliker from a video", mixinStandardHelpOptions = true)
public class DeleteVideoDislikerCommand implements Runnable {

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private String username;

	@Inject
	private VideosClient client;

	@Override
	public void run() {
		HttpResponse<String> response = client.removeDisliker(title, username);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
	}

}


