package com.lord.addressservice.service;

import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;

public interface AddressService {

	public AddressResponse getByProviderId(Long providerId);
	
	public AddressResponse saveAddress(AddressDto addressDto);
		
	
}
