package uk.ac.york.eng2.trendingHashtags.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Hashtag {

    private Long id;
    
    private String name;
    
    private long likeCount;
    
    private long startMillis;
    
    private long endMillis;

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

    public long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(long likeCount) {
        this.likeCount = likeCount;
    }

    public long getStartMillis() {
        return startMillis;
    }

    public void setStartMillis(long startMillis) {
        this.startMillis = startMillis;
    }

    public long getEndMillis() {
        return endMillis;
    }

    public void setEndMillis(long endMillis) {
        this.endMillis = endMillis;
    }
    
	@Override
	public String toString() {
		return "Hashtag [id=" + id + ", name=" + name + ", likeCount=" + likeCount + "]";
	}
}

