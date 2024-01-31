package com.lord.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HandleUserApp extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(UserNotFoundException.class)
	ResponseEntity<String> handleUserNotFound(UserNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}

}
