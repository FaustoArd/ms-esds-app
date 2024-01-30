package com.lord.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.service.DeductionService;

@RestController
@RequestMapping("/api/employee")
public class DeductionController {

	
	@Autowired
	private  final DeductionService deductionService;
	
	private static final Gson gson = new Gson();
	
	public DeductionController(DeductionService deductionService) {
		this.deductionService = deductionService;
	}



	@PostMapping("/deduction_create")
	ResponseEntity<String> createDeduction(@RequestBody DeductionDto deductionDto){
		String response = deductionService.createDeduction(deductionDto);
		return new ResponseEntity<String>(gson.toJson(response),HttpStatus.CREATED);
	}
}
