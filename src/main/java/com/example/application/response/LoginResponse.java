package com.example.application.response;

import java.util.List;

public class LoginResponse {

	    private String accessToken;
	    private String tokenType;
	    private List<String> roles;

	  
	  


		public LoginResponse(String accessToken, String tokenType, List<String> roles) {
			super();
			this.accessToken = accessToken;
			this.tokenType = tokenType;
			this.roles = roles;
		}


		public String getAccessToken() {
			return accessToken;
		}


		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}


		public String getTokenType() {
			return tokenType;
		}


		public void setTokenType(String tokenType) {
			this.tokenType = tokenType;
		}


		public List<String> getRoles() {
			return roles;
		}


		public void setRoles(List<String> roles) {
			this.roles = roles;
		}
	    
	    
	}