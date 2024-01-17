package uk.ac.york.eng2.subscriptions.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class HashtagDTO {
	
	private String name;
	
	
	// protected region execute on begin
	// protected region execute end
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}