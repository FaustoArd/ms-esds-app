package com.lord.providerservice.mapper;

import java.util.List;

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
		provider.setPhone(providerDto.getPhone());
		provider.setEmail(providerDto.getEmail());
		return provider;
	}
	

	@Override
	public ProviderResponse toReponse(Provider provider) {
		if(provider==null) {
			return null;
		}
		ProviderResponse providerResponse = new ProviderResponse();
		
		providerResponse.setSocialName(provider.getSocialName());
		providerResponse.setFantasyName(provider.getFantasyName());
		providerResponse.setPhone(provider.getPhone());
		providerResponse.setEmail(provider.getEmail());
		
		return providerResponse;
	}
	
	@Override
	public ProviderResponse toResponse(ProviderResponse providerResponse, AddressResponse addressResponse) {
		providerResponse.setStreet(addressResponse.getStreet());
		providerResponse.setHouseNumber(addressResponse.getHouseNumber());
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
		providerResponse.setLocality(addressResponse.getLocality());
		providerResponse.setCity(addressResponse.getCity());
		
		return providerResponse;
	}

	@Override
	public List<ProviderResponse> toResponseList(List<Provider> providers, List<AddressResponse> addressesResponses) {
		if(providers==null) {
			return null;
		}
		List<ProviderResponse> responseList = providers.stream().map(this::toReponse).toList();
		
		if(addressesResponses==null) {
			return responseList;
		}
		responseList = addressesResponses.stream().map(this::addressToResponse).toList();
		
		return responseList;
	}


	


	
	
	

}
