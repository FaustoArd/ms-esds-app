package com.lord.providerservice.mapper;

import org.springframework.stereotype.Component;
import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.model.Provider;

@Component
public class ProviderMapperImpl implements ProviderMapper {

	@Override
	public Provider toProvider(ProviderDto providerDto) {
	if(providerDto==null) {
		return null;
	}
		Provider provider = new Provider();
		provider.setId(providerDto.getId());
		provider.setSocialName(providerDto.getSocialName());
		provider.setFantasyName(providerDto.getFantasyName());
		provider.setType(providerDto.getType());
		provider.setCuit(providerDto.getCuit());
		provider.setPhone(providerDto.getPhone());
		provider.setEmail(providerDto.getEmail());
		return provider;
	}
	

	@Override
	public ProviderResponse providerToProviderResponse(Provider provider) {
		if(provider==null) {
			return null;
		}
		ProviderResponse providerResponse = new ProviderResponse();
		
		providerResponse.setId(provider.getId());
		providerResponse.setSocialName(provider.getSocialName());
		providerResponse.setFantasyName(provider.getFantasyName());
		providerResponse.setCuit(provider.getCuit());
		providerResponse.setPhone(provider.getPhone());
		providerResponse.setEmail(provider.getEmail());
		
		return providerResponse;
	}
	
	@Override
	public ProviderResponse toFullProviderResponse(Provider provider, AddressResponse addressResponse) {
		ProviderResponse providerResponse = new ProviderResponse();
		providerResponse.setId(provider.getId());
		providerResponse.setSocialName(provider.getSocialName());
		providerResponse.setFantasyName(provider.getFantasyName());
		providerResponse.setType(provider.getType());
		providerResponse.setCuit(provider.getCuit());
		providerResponse.setEmail(provider.getEmail());
		providerResponse.setPhone(provider.getPhone());
		providerResponse.setStreet(addressResponse.getStreet());
		providerResponse.setHouseNumber(addressResponse.getHouseNumber());
		providerResponse.setgMapsFullname(addressResponse.getgMapsFullname());
		providerResponse.setLocality(addressResponse.getLocality());
		providerResponse.setCity(addressResponse.getCity());
		
		return providerResponse;
	}
	
	@Override
	public ProviderResponse addressToResponse(AddressResponse addressResponse) {
		if(addressResponse==null) {
			return null;
		}
		ProviderResponse providerResponse = new ProviderResponse();
		providerResponse.setStreet(addressResponse.getStreet());
		providerResponse.setHouseNumber(addressResponse.getHouseNumber());
		providerResponse.setgMapsFullname(addressResponse.getgMapsFullname());
		providerResponse.setLocality(addressResponse.getLocality());
		providerResponse.setCity(addressResponse.getCity());
		
		return providerResponse;
	}


	@Override
	public AddressResponse dtoToAddressResponse(ProviderDto providerDto,Long providerId) {
		if(providerDto==null) {
			return null;
		}
		AddressResponse response = new AddressResponse();
		response.setProviderId(providerId);
		response.setStreet(providerDto.getAddress().getStreet());
		response.setHouseNumber(providerDto.getAddress().getHouseNumber());
		response.setgMapsFullname(providerDto.getAddress().getgMapsFullname());
		response.setLocality(providerDto.getAddress().getLocality());
		response.setCity(providerDto.getAddress().getCity());
		return response;
	}

	


	


	
	
	

}
