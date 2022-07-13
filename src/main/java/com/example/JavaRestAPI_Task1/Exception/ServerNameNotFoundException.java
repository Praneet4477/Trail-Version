package com.example.JavaRestAPI_Task1.Exception;

import org.springframework.http.HttpStatus;

public class ServerNameNotFoundException extends RuntimeException {

	HttpStatus error;
	public ServerNameNotFoundException(HttpStatus notFound) {
		this.error=notFound;
	}
	public HttpStatus getError() {
		return error;
	}
	
}
