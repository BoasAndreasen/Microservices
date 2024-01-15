package uk.ac.york.eng2.hashtagRecommendation.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Hashtag {
	
	private Long id;
	
	private String name;

	private String subscribedHashtag;

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

	@Override
	public String toString() {
		return "Hashtag [id=" + id + ", name=" + name + ", subscribedHashtag=" + subscribedHashtag +
			", counter=" + counter + "]";
	}

}
