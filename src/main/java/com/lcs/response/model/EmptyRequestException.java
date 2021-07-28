package com.lcs.response.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class EmptyRequestException extends Exception{

	public EmptyRequestException(String s) {
		super(s);
	}
}
