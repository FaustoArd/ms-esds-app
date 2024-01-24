package com.lord.providerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.service_dao.ProviderServiceDao;

import reactor.core.publisher.Mono;

@Service
public class ProviderServiceImpl implements ProviderService {
	
	@Autowired
	private final ProviderServiceDao providerServiceDao;
	
	private final WebClient webClient;

	public ProviderServiceImpl(ProviderServiceDao providerServiceDao,WebClient.Builder webClientBuilder) {
		this.providerServiceDao = providerServiceDao;
		this.webClient = webClientBuilder.baseUrl("http://localhost:8090").build();
	}
	
	@Override
	public ProviderResponse createProvider(ProviderDto providerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddressResponse getAddressResponse(Long providerId) {

		Mono<AddressResponse> response = webClient.get().uri("/api/address/{providerId}",providerId).retrieve().bodyToMono(AddressResponse.class);
		
		if(!response.equals(null)) {
			return response.block();
		}
		return null;
	}

}
