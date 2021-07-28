package com.lcs.LongestCommonSubstring;

public class InputValue {
	
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "{value:" + value + "}";
	}
	public InputValue(String value) {
		super();
		this.value = value;
	}
	public InputValue() {
		super();
	}
	
	
	
}
