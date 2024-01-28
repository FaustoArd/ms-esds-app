package com.lord.providerservice.service;

import java.util.List;

import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.model.Provider;

public interface ProviderService {
	
	public ProviderResponse createProvider(ProviderDto providerDto);
	
	public AddressResponse getAddressResponse(Long providerId);
	
	public AddressResponse saveAddress(AddressResponse addressResponse);
	
	public List<ProviderResponse> findAllProviders();

}
