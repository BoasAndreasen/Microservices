package uk.ac.york.eng2.hashtagRecommendation.dto;

import io.micronaut.serde.annotation.Serdeable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Serdeable
public class HashtagDTO {

    @Column(nullable = false)
    private String subscribedHashtag;

    @Column(nullable = false)
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

}
