package com.lord.providerservice.mapper;

import java.util.List;

import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.model.Provider;

public interface ProviderMapper {
	
	public Provider toProvider(ProviderDto providerDto);
	
	public ProviderResponse providerToProviderResponse(Provider provider);
	
	public ProviderResponse toFullProviderResponse(Provider provider, AddressResponse addressResponse);
	
	public ProviderResponse addressToResponse(AddressResponse addressResponse);
	
	public AddressResponse dtoToAddressResponse(ProviderDto providerDto,Long providerId);
	
	public List<ProviderResponse> providersToProviderResponses(List<Provider >providers);


}
