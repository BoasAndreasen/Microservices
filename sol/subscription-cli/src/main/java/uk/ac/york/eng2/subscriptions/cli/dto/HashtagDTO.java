package uk.ac.york.eng2.subscriptions.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagDTO {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "HashtagDTO [name=" + name + "]";
	}
}

