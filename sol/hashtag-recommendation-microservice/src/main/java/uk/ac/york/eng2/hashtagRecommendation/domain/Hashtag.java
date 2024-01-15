package uk.ac.york.eng2.hashtagRecommendation.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import io.micronaut.serde.annotation.Serdeable;

@Entity
@Serdeable
public class Hashtag {

    @Id
    @GeneratedValue
    private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String subscribedHashtag;

	@Column(nullable = false)
	private Integer counter;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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