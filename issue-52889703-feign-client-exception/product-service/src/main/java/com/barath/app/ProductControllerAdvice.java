package com.barath.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProductControllerAdvice {
	
		@ExceptionHandler	   
	    public ResponseEntity<?> handleException(Exception exception) {
	        return new ResponseEntity<>("Caused due to : " + exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	    }

}
