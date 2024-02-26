package uk.ac.york.eng2.subscriptions.domain;

// protected region execute on begin
// protected region execute end
public class Hashtag {

    @Id
    @GeneratedValue
    private Long id;
	
    // protected region execute on begin
	// protected region execute end
	private String name;
	
    // protected region execute on begin
	// protected region execute end
	private Set<User> subscribedUsers;
	
    // protected region execute on begin
	// protected region execute end
	private  Set<Video> hashtaggedVideos;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<User> getSubscribedUsers() {
		return subscribedUsers;
	}
	
	public void setSubscribedUsers(Set<User> subscribedUsers) {
		this.subscribedUsers = subscribedUsers;
	}
	
	public  Set<Video> getHashtaggedVideos() {
		return hashtaggedVideos;
	}
	
	public void setHashtaggedVideos( Set<Video> hashtaggedVideos) {
		this.hashtaggedVideos = hashtaggedVideos;
	}
	
}