package com.lord.providerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	@PostMapping("/")
	ResponseEntity<ProviderResponse> saveProvider(@RequestBody ProviderDto providerDto){
		ProviderResponse providerResponse = providerService.createProvider(providerDto);
		return new ResponseEntity<ProviderResponse>(providerResponse,HttpStatus.CREATED);
	}
}
