package com.lord.addressservice.mapper;

import java.util.List;

import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.model.Address;

public interface AddressMapper {
	
	public Address toAddress(AddressDto addressDto);
	
	public AddressResponse toResponse(Address address);
	
	public List<AddressResponse> toResponseList(List<Address> addresses);

}
