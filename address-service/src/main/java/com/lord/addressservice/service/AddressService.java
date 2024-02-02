package com.lord.addressservice.service;

import java.util.List;

import com.lord.addressservice.dto.AddressCompleteResultResponse;
import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;

public interface AddressService {

	public AddressResponse getByProviderId(Long providerId);
	
	public AddressResponse saveAddress(AddressDto addressDto);
	
	public List<AddressCompleteResultResponse> getFullAddressesFromTextSearch(String address);
		
	public AddressResponse findAddressById(Long id);
}
