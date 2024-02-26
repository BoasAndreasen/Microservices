package uk.ac.york.eng2.subscriptions.domain;

// protected region execute on begin
// protected region execute end
public class User {

    @Id
    @GeneratedValue
    private Long id;
	
    // protected region execute on begin
	// protected region execute end
	private String username;
	
    // protected region execute on begin
	// protected region execute end
	private Set<Hashtag> subscribedHashtags;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Set<Hashtag> getSubscribedHashtags() {
		return subscribedHashtags;
	}
	
	public void setSubscribedHashtags(Set<Hashtag> subscribedHashtags) {
		this.subscribedHashtags = subscribedHashtags;
	}
	
}