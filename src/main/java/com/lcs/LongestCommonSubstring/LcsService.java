package com.lcs.LongestCommonSubstring;

import org.springframework.stereotype.Service;

import com.lcs.response.model.EmptyRequestException;
import com.lcs.response.model.ErrorResponse;
import com.lcs.response.model.NoDataFoundCustomException;
import com.lcs.util.InputValidator;

@Service
public class LcsService {

	public Object checkLCS(LcsDTO lcsDTO) throws EmptyRequestException, NoDataFoundCustomException {
		
		String validator = InputValidator.validateInput(lcsDTO);
		String[] arr = lcsDTO.getSetOfStrings().stream()
				.map(valu -> valu.getValue())
				.toArray(String[]::new);
		
		int totalLength = arr.length;
		String firstElement = arr[0];
		int elementLength = firstElement.length();

		String result = "";

		for (int i = 0; i < elementLength; i++) {
			for (int j = i + 1; j <= elementLength; j++) {

				String comparingResult = firstElement.substring(i, j);
				int k = 1;
				for (k = 1; k < totalLength; k++)

					if (!arr[k].contains(comparingResult)) {
						break;
					}

				if (k == totalLength && result.length() < comparingResult.length())
					result = comparingResult;
			}
		}
		
		OutputValue outputValue = new OutputValue();
		outputValue.setValue(result);
		LCSResponse response = new LCSResponse();
		response.getLcs().add(outputValue);
		
		if(result == "") throw new NoDataFoundCustomException("No Data founded for the given inputs");
		
		return response;
	}
}
