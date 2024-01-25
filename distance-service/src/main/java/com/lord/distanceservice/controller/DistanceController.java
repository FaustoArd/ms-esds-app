package com.lord.distanceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lord.distanceservice.dto.DistanceDto;
import com.lord.distanceservice.model.DistanceMatrixResponse;
import com.lord.distanceservice.service.DistanceService;

@RestController
@RequestMapping("/api/distance")
public class DistanceController {
	
	@Autowired
	private final DistanceService distanceService;

	public DistanceController(DistanceService distanceService) {
		this.distanceService = distanceService;
	}
	
	@GetMapping("/distance")
	ResponseEntity<DistanceMatrixResponse> getDistanceFromMaps(@RequestBody DistanceDto distanceDto){
		DistanceMatrixResponse response = distanceService.getDistanceFromMaps(distanceDto);
		return new ResponseEntity<DistanceMatrixResponse>(response,HttpStatus.OK);
	}
	
	
	
}
