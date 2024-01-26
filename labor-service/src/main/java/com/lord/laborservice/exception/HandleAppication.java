package com.lord.laborservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HandleAppication extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(ItemNotFoundException.class)
	ResponseEntity<String> handleItemNotFound(ItemNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}

}
