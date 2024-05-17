package com.validate.entities;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginData {
	@NotBlank(message = "Username can not be empty!!")
	@Size(min = 3,max = 12,message = "Username must be between 3-12 characters!!")
	private String username;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid Email!!")
	private String email;
	
	@AssertTrue(message = "Must agree terms and condition")
	private boolean agreed;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + "]";
	}
	
	
	
}

