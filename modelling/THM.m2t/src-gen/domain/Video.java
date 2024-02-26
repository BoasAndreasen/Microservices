package uk.ac.york.eng2.subscriptions.domain;

// protected region execute on begin
// protected region execute end
public class Video {

    @Id
    @GeneratedValue
    private Long id;
	
    // protected region execute on begin
	// protected region execute end
	private String title;
	
    // protected region execute on begin
	// protected region execute end
	private Set<Hashtag> hashtags;
	
    // protected region execute on begin
	// protected region execute end
	private long views;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Set<Hashtag> getHashtags() {
		return hashtags;
	}
	
	public void setHashtags(Set<Hashtag> hashtags) {
		this.hashtags = hashtags;
	}
	
	public long getViews() {
		return views;
	}
	
	public void setViews(long views) {
		this.views = views;
	}
	
}