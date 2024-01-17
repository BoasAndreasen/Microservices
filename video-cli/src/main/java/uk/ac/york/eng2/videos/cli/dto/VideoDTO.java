package uk.ac.york.eng2.videos.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class VideoDTO {

	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	

	@Override
	public String toString() {
		return "VideoDTO [title=" + title + "]";
	}

}
