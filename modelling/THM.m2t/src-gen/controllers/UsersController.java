package uk.ac.york.eng2.subscriptions.controllers;

// protected region execute on begin
// protected region execute end

@Controller("/subscriptionUsers")
public class UsersController {
	
	@Inject
	UsersRepository usersRepository;
	
	// protected region execute on begin
	// protected region execute end
	
	// protected region execute on begin
	// protected region execute end
	@Get("/")
	public Iterable<User> list() {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Post("/")
	public HttpResponse<Void> add(@Body UserDTO userDetails) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{id}")
	public UserDTO getUser(long id) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/byUsername/{username}")
	public User getUserByUsername(String username) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Put("/{id}")
	public HttpResponse<Void> updateUser(long id, @Body UserDTO userDetails) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Delete("/{username}")
	public HttpResponse<Void> deleteUser(String username) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{username}/subscribedHashtags")
	public Iterable<Hashtag> getSubscribedHashtags(String username) {
		// protected region execute on begin
		// protected region execute end
	}
	
	// protected region execute on begin
	// protected region execute end
	@Get("/{username}/topTenVideosUsingSubscribedHashtags")
	public Iterable<Video> topTenVideosUsingSubscribedHashtags(String username) {
		// protected region execute on begin
		// protected region execute end
	}
	
}

