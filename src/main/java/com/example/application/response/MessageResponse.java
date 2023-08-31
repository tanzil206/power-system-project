package com.example.application.response;

import org.springframework.http.HttpStatus;

public class MessageResponse {

	HttpStatus httpStatus;
	String message;

	public MessageResponse(String message) {
		super();
		this.message = message;
	}

	public MessageResponse(HttpStatus httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}