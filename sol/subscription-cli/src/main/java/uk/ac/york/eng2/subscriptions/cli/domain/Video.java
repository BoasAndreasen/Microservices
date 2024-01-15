package uk.ac.york.eng2.subscriptions.cli.domain;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class Video {

	private Long id;
	private String title;
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
	

	public long getViews() {
		return views;
	}

	public void setViews(long views) {
		this.views = views;
	}
	
	@Override
	public String toString() {
		return "Video [id=" + id + ", title=" + title + ", views=" + views + "]";
	}


}
