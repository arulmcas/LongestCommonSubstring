package com.lcs.util;

public enum HTTP_STATUS {
	
	OK("200"),BAD_REQUEST("400"), NOT_FOUND("404");
	
	public String name="";

	HTTP_STATUS(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
