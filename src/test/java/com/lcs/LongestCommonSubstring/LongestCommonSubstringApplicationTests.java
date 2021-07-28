package com.lcs.LongestCommonSubstring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lcs.response.model.EmptyRequestException;
import com.lcs.response.model.NoDataFoundCustomException;

@SpringBootTest
class LongestCommonSubstringApplicationTests {

	@Autowired
	LcsService lcsService;
	
	
	@Test
	@Order(1)
	void test200ForValidInputs() throws EmptyRequestException, NoDataFoundCustomException {
		LcsDTO dto = new LcsDTO();
		dto.setSetOfStrings(Arrays.asList(
				new InputValue("comcast"),
				new InputValue("communicate"),
				new InputValue("commutation")
				));
		
		LCSResponse resp = (LCSResponse)lcsService.checkLCS(dto);
		assertEquals(resp.getLcs().get(0).getValue(), "com");
	}

	@Test
	@Order(2)
	void test404ForInValidInputs() throws EmptyRequestException, NoDataFoundCustomException {
		LcsDTO dto = new LcsDTO();
		dto.setSetOfStrings(Arrays.asList(
				new InputValue("abcd"),
				new InputValue("efgh"),
				new InputValue("zxoh")
				));
		
		NoDataFoundCustomException nodataexception = (NoDataFoundCustomException)lcsService.checkLCS(dto);
		System.out.println(nodataexception.getMessage());
		assertEquals(nodataexception.getMessage(), "No Data founded for the given inputs");
	}
}
