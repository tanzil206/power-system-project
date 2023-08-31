package com.example.application.response;

import org.springframework.http.HttpStatus;

public class MessageResponse {


	String message;

	public MessageResponse(String message) {
		super();
		this.message = message;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}