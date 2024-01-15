package uk.ac.york.eng2.subscriptions.domain;

// protected region execute on begin
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
// protected region execute end
public class Hashtag {

    @Id
    @GeneratedValue
    private Long id;
	
    // protected region execute on begin
	@Column(nullable = false)
	// protected region execute end
	private String name;
	
    // protected region execute on begin
	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	    name = "user_subscribers",
	    joinColumns = @JoinColumn(name = "hashtag_id"),
	    inverseJoinColumns = @JoinColumn(name = "user_id")
	)
	// protected region execute end
	private Set<User> subscribedUsers;
	
    // protected region execute on begin
	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	    name = "video_hashtags",
	    joinColumns = @JoinColumn(name = "hashtag_id"),
	    inverseJoinColumns = @JoinColumn(name = "video_id")
	)
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