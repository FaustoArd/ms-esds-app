package com.lord.addressservice.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.model.Address;

@Component
public class AddressMapperImpl implements AddressMapper {

	@Override
	public Address toAddress(AddressDto addressDto) {
		if(addressDto==null) {
			return null;
		}
		Address address = new Address();
		address.setStreet(addressDto.getStreet());
		address.setNumber(addressDto.getNumber());
		address.setLocality(addressDto.getLocality());
		address.setCity(addressDto.getCity());
		address.setCustomerId(addressDto.getCustomerId());
		address.setProviderId(addressDto.getProviderId());
		
		return address;
	}
	
	public AddressResponse toResponse(Address address) {
		if(address==null) {
			return null;
		}
		AddressResponse addressResponse = new AddressResponse();
		addressResponse.setStreet(address.getStreet());
		addressResponse.setNumber(address.getNumber());
		addressResponse.setLocality(address.getLocality());
		addressResponse.setCity(address.getCity());
		
		return addressResponse;
	}
	
	public List<AddressResponse> toResponseList(List<Address> addresses){
		if(addresses==null) {
			return null;
		}
		List<AddressResponse> responseList = addresses.stream().map(this::toResponse).toList();
		
		return responseList;
		
	}
	

}
