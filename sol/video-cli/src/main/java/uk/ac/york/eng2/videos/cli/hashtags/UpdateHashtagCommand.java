package uk.ac.york.eng2.videos.cli.hashtags;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.HashtagDTO;

@Command(name="update-hashtag", description="Updates a hashtag", mixinStandardHelpOptions = true)
public class UpdateHashtagCommand implements Runnable {

	@Parameters(index="0")
	private Long id;

	@Option(names = {"-u", "--name"}, description="Name of the hashtag")
	private String name;

	@Inject
	private HashtagsClient client;

	@Override
	public void run() {
		HashtagDTO hashtagDetails = new HashtagDTO();
		if (name != null) {
			hashtagDetails.setName(name);
		}
		
		HttpResponse<Void> response = client.updateHashtag(id, hashtagDetails);
		System.out.println("Server responded with: " + response.getStatus());
	}

	
}
