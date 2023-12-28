package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-video-viewer", description="Deletes a viewer from a video", mixinStandardHelpOptions = true)
public class DeleteVideoViewerCommand implements Runnable {

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private String username;

	@Inject
	private VideosClient client;

	@Override
	public void run() {
		HttpResponse<String> response = client.removeViewer(title, username);
		System.out.printf("Server responded with status %s: %s%n",
			response.getStatus(), response.getBody().orElse("(no text)"));
	}

}
