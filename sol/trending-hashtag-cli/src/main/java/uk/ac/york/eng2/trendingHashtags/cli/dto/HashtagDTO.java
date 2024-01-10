package uk.ac.york.eng2.trendingHashtags.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagDTO {

    private String name;

    private long likeCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }
    
	@Override
	public String toString() {
		return "HashtagDTO [name=" + name + ", likeCount=" + likeCount + "]";
	}
}
