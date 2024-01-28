package com.lord.supplyservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.lord.supplyservice.dto.SupplyDto;
import com.lord.supplyservice.dto.SupplyResponse;
import com.lord.supplyservice.service.SupplyService;

@RestController
@RequestMapping("/api/supply")
public class SupplyController {
	
	@Autowired
	private final SupplyService supplyService;
	
	private static final Gson gson = new Gson();
	
	public SupplyController(SupplyService supplyService) {
		this.supplyService = supplyService;
	}
	
	
	@PostMapping("/create")
	ResponseEntity<String> createSupply(@RequestBody SupplyDto supplyDto){
		String supplyDescription = supplyService.createSupply(supplyDto);
		return new ResponseEntity<String>(gson.toJson(supplyDescription),HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	ResponseEntity<List<SupplyResponse>> findAllSupplies(){
		List<SupplyResponse> responses = supplyService.findAllSupplies();
		return ResponseEntity.ok(responses);
	}

}
