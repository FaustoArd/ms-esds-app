package com.lord.enterpriseservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.result.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HandleEnterprise extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(EnterpriseNotFoundException.class)
	ResponseEntity<String> handleExterpriseNotFound(EnterpriseNotFoundException ex){
		return new ResponseEntity<String>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}

}
