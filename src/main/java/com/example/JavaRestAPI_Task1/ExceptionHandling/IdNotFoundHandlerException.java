package com.example.JavaRestAPI_Task1.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.JavaRestAPI_Task1.Exception.IdNotFoundException;

@ControllerAdvice
public class IdNotFoundHandlerException {

	@ResponseBody
	@ExceptionHandler(IdNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(IdNotFoundException ex) {
	  
		return ex.getMessage();
	  }
}
