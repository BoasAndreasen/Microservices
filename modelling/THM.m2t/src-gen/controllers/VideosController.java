package uk.ac.york.eng2.subscriptions.controllers;

// protected region execute on begin
// protected region execute end

@Controller("/subscriptionVideos")
public class VideosController {
	
	@Inject
	VideosRepository videosRepository;
	
	// protected region execute on begin
	// protected region execute end
	
	// protected region execute on begin
	// protected region execute end
	@Get("/")
	public Iterable<Video> list() {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Post("/")
	public HttpResponse<Void> add(@Body VideoDTO videoDetails) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{id}")
	public VideoDTO getVideo(long id) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/byName/{title}/id")
	public long getVideoidByName(String title) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Put("/{id}")
	public HttpResponse<Void>  updateVideo(long id, @Body VideoDTO videoDetails) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Delete("/{title}")
	public HttpResponse<Void> deleteVideo(String title) {
		// protected region execute on begin
		// protected region execute end
	}
	
}

