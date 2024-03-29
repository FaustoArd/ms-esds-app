package com.lord.providerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.service.ProviderService;

@RestController
@RequestMapping("/api/provider")
public class ProviderController {
	
	@Autowired
	private final ProviderService providerService;

	public ProviderController(ProviderService providerService) {
		this.providerService = providerService;
	}
	
	@PostMapping("/new")
	ResponseEntity<ProviderResponse> createProvider(@RequestBody ProviderDto providerDto){
		ProviderResponse providerResponse = providerService.createProvider(providerDto);
		return new ResponseEntity<ProviderResponse>(providerResponse,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	ResponseEntity<List<ProviderResponse>> findAllProviders(){
		List<ProviderResponse> responses = providerService.findAllProviders();
		return ResponseEntity.ok(responses);
	}
}
