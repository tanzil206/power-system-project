package com.example.application.response;

public class LoginReq {
    private String username;
    private String password;

    public LoginReq(String username, String password) {
        this.username = username;
        this.password = password;
    }

  

    public String getUsername() {
		return username;
	}



	public void setUserName(String username) {
		this.username = username;
	}



	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
