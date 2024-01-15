package uk.ac.york.eng2.subscriptions.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class VideoDTO {
	
	private String title;
	
	private long views;
	
	
	// protected region execute on begin
	// protected region execute end
	
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
	
}