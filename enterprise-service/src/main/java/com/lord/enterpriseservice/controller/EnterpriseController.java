package com.lord.enterpriseservice.controller;

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
import com.lord.enterpriseservice.dto.EnterpriseCreateResponse;
import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.service.EnterpriseService;

@RestController
@RequestMapping("/api/enterprise")
public class EnterpriseController {
	
	@Autowired
	private final EnterpriseService enterpriseService;

	private final static Gson gson = new Gson();
	
	public EnterpriseController(EnterpriseService enterpriseService) {
		this.enterpriseService = enterpriseService;
	}

	@PostMapping("/enterprise_create")
	ResponseEntity<EnterpriseCreateResponse> createEnterprise(@RequestBody EnterpriseDto enterpriseDto){
		EnterpriseCreateResponse  response = enterpriseService.createEnterprise(enterpriseDto);
		return new ResponseEntity<EnterpriseCreateResponse>(response,HttpStatus.CREATED);
	}
	
	@GetMapping("/enterprise_by_id/{id}")
	ResponseEntity<EnterpriseResponse> findEnterpriseById(@PathVariable("id")Long id){
		EnterpriseResponse response = enterpriseService.findEnterpriseById(id);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/enterprise_by_user_id/{id}")
	ResponseEntity<List<EnterpriseResponse>> findEnterprisesByUserId(@PathVariable("id")Long id){
		List<EnterpriseResponse> responses = enterpriseService.findEnterprisesByUserId(id);
		return ResponseEntity.ok(responses);
	}
	
}
