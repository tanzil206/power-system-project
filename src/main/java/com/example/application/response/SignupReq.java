package com.example.application.response;

import java.util.List;
import java.util.Set;

public class SignupReq {
	
	 private String email;
    private String username;
    private String password;
    private Set<String> role;


  

    public SignupReq(String email, String username, String password, Set<String> role) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.role = role;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Set<String> getRole() {
		return role;
	}



	public void setRole(Set<String> role) {
		this.role = role;
	}



	



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
