package com.lord.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.service.AddressService;


@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private final AddressService addressService;
	
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@GetMapping("/by_provider/{providerId}")
	ResponseEntity<AddressResponse> findAddressByProviderId(@PathVariable("providerId")Long providerId){
		AddressResponse addressResponse = addressService.getByProviderId(providerId);
		return ResponseEntity.ok(addressResponse);
	}

}
