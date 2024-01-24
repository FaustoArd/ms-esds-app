package com.lord.providerservice.mapper;

import java.util.List;

import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.model.Provider;

public interface ProviderMapper {
	
	public Provider toProvider(ProviderDto providerDto);
	
	public ProviderResponse toReponse(Provider provider);
	
	public ProviderResponse toResponse(ProviderResponse providerResponse, AddressResponse addressResponse);
	
	public ProviderResponse addressToResponse(AddressResponse addressResponse);
	
	public List<ProviderResponse> toResponseList(List<Provider> providers, List<AddressResponse> addressesResponses);

}
