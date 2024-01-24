package com.lord.providerservice.mapper;

import java.util.List;
import java.util.ListIterator;

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
	public ProviderResponse toProviderResponse(Provider provider) {
		if(provider==null) {
			return null;
		}
		ProviderResponse providerResponse = new ProviderResponse();
		
		providerResponse.setId(provider.getId());
		providerResponse.setSocialName(provider.getSocialName());
		providerResponse.setFantasyName(provider.getFantasyName());
		providerResponse.setPhone(provider.getPhone());
		providerResponse.setEmail(provider.getEmail());
		
		return providerResponse;
	}
	
	@Override
	public ProviderResponse toFullProviderResponse(ProviderResponse providerResponse, AddressResponse addressResponse) {
		
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
		List<ProviderResponse> responseList = providers.stream().map(this::toProviderResponse).toList();
		
		if(addressesResponses==null) {
			return responseList;
		}
		ListIterator<AddressResponse> addressessIt = addressesResponses.listIterator();
		while(addressessIt.hasNext()) {
			responseList.stream().map(res ->{
				ProviderResponse response = new ProviderResponse();
				
				if(res.getId().equals(addressessIt.next().getProviderId())) {
					AddressResponse addressCurrentResponse = addressessIt.next();
					response.setId(res.getId());
					response.setSocialName(res.getSocialName());
					response.setFantasyName(res.getFantasyName());
					response.setEmail(res.getEmail());
					response.setPhone(res.getPhone());
					response.setStreet(addressCurrentResponse.getStreet());
					response.setHouseNumber(addressCurrentResponse.getHouseNumber());
					response.setLocality(addressCurrentResponse.getLocality());
					response.setCity(addressCurrentResponse.getCity());
					
				}
				if(addressessIt.nextIndex()==addressesResponses.size()) {
					return responseList;
				}
				return response;
			}).toList();
		}
		return responseList;
	}


	


	
	
	

}
