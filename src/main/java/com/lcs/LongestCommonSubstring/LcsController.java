package com.lcs.LongestCommonSubstring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lcs.response.model.EmptyRequestException;
import com.lcs.response.model.NoDataFoundCustomException;

@RestController
public class LcsController {

	@Autowired
	LcsService lcsService;
	
	@PostMapping(path = "/api/v1/lcs", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getLCSFromInput(@RequestBody LcsDTO lcsDto) throws EmptyRequestException, NoDataFoundCustomException {
		return ResponseEntity.ok(lcsService.checkLCS(lcsDto));
	}
}
