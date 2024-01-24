package com.lord.providerservice.service;

import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;

public interface ProviderService {
	
	public ProviderResponse createProvider(ProviderDto providerDto);
	
	public AddressResponse getAddressResponse(Long providerId);
	
	public AddressResponse saveAddress(AddressResponse addressResponse);

}
