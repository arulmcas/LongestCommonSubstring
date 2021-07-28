package com.lcs.util;

import java.util.List;

import com.lcs.LongestCommonSubstring.InputValue;
import com.lcs.LongestCommonSubstring.LcsDTO;
import com.lcs.response.model.EmptyRequestException;
import com.lcs.response.model.ErrorResponse;

public class InputValidator {

	public static String validateInput(LcsDTO lcsDto) throws EmptyRequestException {
		
		List<InputValue> inputs = lcsDto.getSetOfStrings();
		
		if(inputs.isEmpty()) {
			throw new EmptyRequestException(MessageUtil.emptyBodyRequest);
		}
		
		return "";
	}
}
