package com.lord.addressservice.mapper;

import java.util.List;

import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.model.Address;

public interface AddressMapper {
	
	public Address dtoToAddress(AddressDto addressDto);
	
	public AddressResponse addressToResponse(Address address);
	
	public AddressResponse dtoToResponse(AddressDto addressDto);
	
	public List<AddressResponse> addressToResponseList(List<Address> addresses);

}
