package com.lord.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lord.employeeservice.dto.FortNightDto;
import com.lord.employeeservice.dto.FortNightResponse;
import com.lord.employeeservice.service.ForthNightService;

@RestController
@RequestMapping("/api/employee")
public class FortNightController {
	
	@Autowired
	private final ForthNightService forthNightService;
	
	public FortNightController(ForthNightService forthNightService) {
		this.forthNightService = forthNightService;
	}
	
	@PostMapping("/fort_night_create")
	ResponseEntity<FortNightResponse> createForthNight(@RequestBody FortNightDto fortNightDto){
		FortNightResponse response = forthNightService.createForthNight(fortNightDto);
		return new ResponseEntity<FortNightResponse>(response,HttpStatus.CREATED);
	}
	
	@GetMapping("/forth_night_by_id/{id}")
	ResponseEntity<FortNightResponse> findFortNightById(@PathVariable("id")Long id){
		FortNightResponse response = forthNightService.findFortNightById(id);
		return ResponseEntity.ok(response);
	}

}
