package com.lord.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lord.customerservice.dto.CustomerDto;
import com.lord.customerservice.dto.CustomerResponse;
import com.lord.customerservice.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private final CustomerService customerService;

	
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@PostMapping("/new")
	ResponseEntity<CustomerResponse> newCustomer(@RequestBody CustomerDto customerDto){
		CustomerResponse response = customerService.createCustomer(customerDto);
		return new ResponseEntity<CustomerResponse>(response,HttpStatus.CREATED);
	}
}
