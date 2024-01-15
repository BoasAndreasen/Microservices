package uk.ac.york.eng2.hashtagRecommendation.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagDTO {
	
	private String subscribedHashtag;

	private Integer counter;

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
		return "HashtagDTO [subscribedHashtag=" + subscribedHashtag +
				", counter=" + counter + "]";
	}
}

