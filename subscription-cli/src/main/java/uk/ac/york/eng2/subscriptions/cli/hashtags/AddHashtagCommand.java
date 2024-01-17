package uk.ac.york.eng2.subscriptions.cli.hashtags;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.subscriptions.cli.dto.HashtagDTO;

@Command(name="add-hashtag", description="Adds a hashtag", mixinStandardHelpOptions = true)
public class AddHashtagCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		HashtagDTO dto = new HashtagDTO();
		dto.setName(name);

		HttpResponse<Void> response = client.add(dto);
		System.out.println("Server responded with: " + response.getStatus());
	}

}
