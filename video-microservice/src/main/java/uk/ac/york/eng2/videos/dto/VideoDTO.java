package uk.ac.york.eng2.videos.dto;

import io.micronaut.serde.annotation.Serdeable;
import uk.ac.york.eng2.videos.domain.User;

@Serdeable
public class VideoDTO {

	private String title;
	private User uploader;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getUploader() {
		return uploader;
	}

	public void setUploader(User uploader) {
		this.uploader = uploader;
	}

}
