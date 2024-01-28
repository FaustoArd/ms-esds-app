package com.lord.addressservice.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.model.Address;

@Component
public class AddressMapperImpl implements AddressMapper {

	@Override
	public Address dtoToAddress(AddressDto addressDto) {
		if(addressDto==null) {
			return null;
		}
		Address address = new Address();
		address.setStreet(addressDto.getStreet());
		address.setHouseNumber(addressDto.getHouseNumber());
		address.setgMapsFullname(addressDto.getgMapsFullname());
		address.setLocality(addressDto.getLocality());
		address.setCity(addressDto.getCity());
		address.setCustomerId(addressDto.getCustomerId());
		address.setProviderId(addressDto.getProviderId());
		
		return address;
	}
	
	@Override
	public AddressResponse dtoToResponse(AddressDto addressDto) {
		if(addressDto==null) {
			return null;
		}
		AddressResponse addressResponse = new AddressResponse();
		addressResponse.setId(addressDto.getId());
		addressResponse.setStreet(addressDto.getStreet());
		addressResponse.setHouseNumber(addressDto.getHouseNumber());
		addressResponse.setgMapsFullname(addressDto.getgMapsFullname());
		addressResponse.setLocality(addressDto.getLocality());
		addressResponse.setCity(addressDto.getCity());
		return addressResponse;
	}
	
	@Override
	public AddressResponse addressToResponse(Address address) {
		if(address==null) {
			return null;
		}
		AddressResponse addressResponse = new AddressResponse();
		addressResponse.setStreet(address.getStreet());
		addressResponse.setHouseNumber(address.getHouseNumber());
		addressResponse.setgMapsFullname(address.getgMapsFullname());
		addressResponse.setLocality(address.getLocality());
		addressResponse.setCity(address.getCity());
		
		return addressResponse;
	}
	
	@Override
	public List<AddressResponse> addressToResponseList(List<Address> addresses){
		if(addresses==null) {
			return null;
		}
		List<AddressResponse> responseList = addresses.stream().map(this::addressToResponse).toList();
		
		return responseList;
		
	}
	

}
