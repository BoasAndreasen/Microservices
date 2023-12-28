package uk.ac.york.eng2.videos.cli.hashtags;

import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.HashtagDTO;

@Command(name="get-hashtag-by-name", description="Gets a specific hashtag by name", mixinStandardHelpOptions = true)
public class GetHashtagByNameCommand implements Runnable {

	@Inject
	private HashtagsClient client;

	@Parameters(index="0")
	private String name;

	@Override
	public void run() {
		HashtagDTO hashtag = client.getHashtagByName(name);
		if (hashtag == null) {
			System.err.println("Hashtag not found!");
			System.exit(1);
		} else {
			System.out.println(hashtag);
		}
	}
}
