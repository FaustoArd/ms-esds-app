package com.lord.employeeservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.lord.employeeservice.dto.DeductionDto;
import com.lord.employeeservice.dto.DeductionResponse;
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
	@GetMapping("/deduction_by_id/{id}")
	ResponseEntity<DeductionResponse> findDeductionById(@PathVariable("id")Long id){
		DeductionResponse response = deductionService.findDeductionbyId(id);
		return ResponseEntity.ok(response);
	}
	@GetMapping("/deduction_by_enterprise_id/{enterpriseId}")
	ResponseEntity<List<DeductionResponse>> findEnterpriseById(@PathVariable("enterpriseId")Long enterpriseId){
		List<DeductionResponse>  response = deductionService.findByEnterpriseId(enterpriseId);
		return ResponseEntity.ok(response);
	}
}
