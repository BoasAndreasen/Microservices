package uk.ac.york.eng2.subscriptions.events;

// protected region execute on begin
// protected region execute end

@KafkaListener
public class VideosConsumer {

	@Inject
	VideosRepository videosRepository;
	
	@Inject
	HashtagsRepository hashtagsRepository;
	
	
	
	@Topic("video-watched")
	public void watchedVideo(@KafkaKey String title, String hashtagSet) {
		// protected region execute on begin
		// protected region execute end
	}
}

