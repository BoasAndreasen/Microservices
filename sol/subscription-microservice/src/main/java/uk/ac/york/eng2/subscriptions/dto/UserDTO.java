package uk.ac.york.eng2.subscriptions.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class UserDTO {
	
	private String username;
	
	
	// protected region execute on begin
	// protected region execute end
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
}