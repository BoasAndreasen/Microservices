package uk.ac.york.eng2.books.cli.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public class UserDTO {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "UserDTO [username=" + username + "]";
	}

}
