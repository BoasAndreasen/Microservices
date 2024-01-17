package uk.ac.york.eng2.hashtagRecommendation.domain;

// protected region execute on begin
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	@Column(nullable = false)
	// protected region execute end
	private String subscribedHashtag;
	
    // protected region execute on begin
	@Column(nullable = false)
	// protected region execute end
	private Integer counter;
	
	
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
	
	public String getSubscribedHashtag() {
		return subscribedHashtag;
	}
	
	public void setSubscribedHashtag(String subscribedHashtag) {
		this.subscribedHashtag = subscribedHashtag;
	}
	
	public Integer getCounter() {
		return counter;
	}
	
	public void setCounter(Integer counter) {
		this.counter = counter;
	}
	
}