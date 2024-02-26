package uk.ac.york.eng2.subscriptions.controllers;

// protected region execute on begin
// protected region execute end

@Controller("/subscriptionHashtags")
public class HashtagsController {
	
	@Inject
	HashtagsRepository hashtagsRepository;
	
	@Inject
	UsersRepository usersRepository;
	
	// protected region execute on begin
	// protected region execute end
	
	// protected region execute on begin
	// protected region execute end
	@Get("/")
	public Iterable<Hashtag>  list() {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Post("/")
	public HttpResponse<Void> add(@Body HashtagDTO hashtagDetails) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{id}")
	public HashtagDTO getHashtag(long id) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/byName/{name}")
	public Hashtag getHashtagByName(String name) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Put("/{id}")
	public HttpResponse<Void> updateHashtag(long id, @Body HashtagDTO hashtagDetails) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Delete("/{name}")
	public HttpResponse<Void> deleteHashtag(String name) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{name}/subscribers")
	public Iterable<User> getSubscriber(String name) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Put("/{name}/subscribers/{username}")
	public HttpResponse<String> addSubscriber(String name, String username) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Delete("/{name}/subscribers/{username}")
	public HttpResponse<String> removeSubscriber(String name, String username) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{name}/hashtagged")
	public Iterable<Video> getHashtaggedVideos(String name) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{name}/hashtagged/topTen")
	public Iterable<Video> getSortedHashtaggedVideos(String name) {
		// protected region execute on begin
		// protected region execute end
	}
	
}

