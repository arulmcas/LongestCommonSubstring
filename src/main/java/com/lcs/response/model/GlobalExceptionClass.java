package com.lcs.response.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionClass {

	@ExceptionHandler(EmptyRequestException.class)
	public ResponseEntity<Object> sendErrorResp(EmptyRequestException ex, WebRequest request) {
		Map<String, Object> body = new HashMap<>();
		body.put("date", LocalDateTime.now());
		body.put("message", ex.getMessage());
		
		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoDataFoundCustomException.class)
	public ResponseEntity<Object> sendNoDataFoundResp(NoDataFoundCustomException ex, WebRequest request) {
		Map<String, Object> body = new HashMap<>();
		body.put("date", LocalDateTime.now());
		body.put("message", ex.getMessage());
		
		return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
	}
}
