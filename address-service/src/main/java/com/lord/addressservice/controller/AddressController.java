package com.lord.addressservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lord.addressservice.dto.AddressCompleteResultResponse;
import com.lord.addressservice.dto.AddressDto;
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
	
	@GetMapping("/by_id/{id}")
	ResponseEntity<AddressResponse> findAddressById(@PathVariable("id")Long id){
		AddressResponse response = addressService.findAddressById(id);
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/by_provider/{providerId}")
	ResponseEntity<AddressResponse> findAddressByProviderId(@PathVariable("providerId")Long providerId){
		AddressResponse addressResponse = addressService.getByProviderId(providerId);
		return ResponseEntity.ok(addressResponse);
	}
	
	@GetMapping("/search")
	ResponseEntity<List<AddressCompleteResultResponse>> getCompletedAddressesFromTextSearch(@RequestParam("address")String address){
		List<AddressCompleteResultResponse> results = addressService.getFullAddressesFromTextSearch(address);
		return ResponseEntity.ok(results);
	}

	
	@PostMapping("/")
	ResponseEntity<AddressResponse> saveAddress(@RequestBody AddressDto addressDto){
		AddressResponse addressResponse = addressService.saveAddress(addressDto);
		return new ResponseEntity<AddressResponse>(addressResponse,HttpStatus.CREATED);
	}
}
