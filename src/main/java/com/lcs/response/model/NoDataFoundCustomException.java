package com.lcs.response.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NoDataFoundCustomException extends Exception{
	
	public NoDataFoundCustomException(String s) {
		super(s);
	}

}
