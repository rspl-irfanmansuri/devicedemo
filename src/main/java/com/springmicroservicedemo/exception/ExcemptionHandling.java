package com.springmicroservicedemo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExcemptionHandling {

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> handleCommonExcelption(Exception e) {
		return ResponseEntity.ok().body(e.getMessage());
	}

	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<?> handleRuntimeException(RuntimeException e) {
		return ResponseEntity.ok().body(e.getMessage());
	}

}
