package uk.ac.york.eng2.videos.cli.hashtags;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

@Command(name="delete-hashtag", description="Deletes a hashtag", mixinStandardHelpOptions = true)
public class DeleteHashtagCommand implements Runnable {

	@Parameters(index="0")
	private String name;

	@Inject
	private HashtagsClient client;

	@Override
	public void run() {
		HttpResponse<Void> response = client.deleteHashtag(name);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
