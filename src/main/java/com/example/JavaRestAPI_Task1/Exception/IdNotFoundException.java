package com.example.JavaRestAPI_Task1.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class IdNotFoundException extends RuntimeException {

	HttpStatus error;
	public IdNotFoundException(HttpStatus notFound){
		this.error = notFound;
	}
	public HttpStatus getError() {
		return error;
	}
	
}
