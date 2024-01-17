package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.HttpResponse;
import jakarta.inject.Inject;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;
import uk.ac.york.eng2.videos.cli.dto.UserDTO;
import uk.ac.york.eng2.videos.cli.dto.VideoDTO;
import uk.ac.york.eng2.videos.cli.users.UsersClient;

@Command(name="add-video", description="Adds a video", mixinStandardHelpOptions = true)
public class AddVideoCommand implements Runnable {

	@Inject
	private VideosClient client;
	
	@Inject
	private UsersClient usersClient;

	@Parameters(index="0")
	private String title;

	@Parameters(index="1")
	private String uploaderUsername;

	@Override
	public void run() {
        UserDTO existingUploader = usersClient.getUserByUsername(uploaderUsername);
                
        if (existingUploader != null) {
        	
            VideoDTO dto = new VideoDTO();
            dto.setTitle(title);
            
            HttpResponse<Void> response = client.add(uploaderUsername, dto);
            System.out.println("Server responded with: " + response.getStatus());
        } else {
            System.out.println("User with username " + uploaderUsername + " not found.");
        }
	}

}
