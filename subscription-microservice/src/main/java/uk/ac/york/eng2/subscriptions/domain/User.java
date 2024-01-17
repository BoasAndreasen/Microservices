package uk.ac.york.eng2.subscriptions.domain;

// protected region execute on begin
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
// protected region execute end
public class User {

    @Id
    @GeneratedValue
    private Long id;
	
    // protected region execute on begin
	@Column(nullable = false)
	// protected region execute end
	private String username;
	
    // protected region execute on begin
	@JsonIgnore
	@ManyToMany(mappedBy = "subscribedUsers", fetch = FetchType.EAGER)
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