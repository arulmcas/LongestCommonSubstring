package com.lcs.LongestCommonSubstring;

import java.util.ArrayList;
import java.util.List;

public class LCSResponse {

	List<OutputValue> lcs = new ArrayList<>();

	public List<OutputValue> getLcs() {
		return lcs;
	}

	public void setLcs(List<OutputValue> lcs) {
		this.lcs = lcs;
	}

}

class OutputValue {
	
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "{\"LCS\":[{ \"value\":" + value + "}]}";
	}
}
