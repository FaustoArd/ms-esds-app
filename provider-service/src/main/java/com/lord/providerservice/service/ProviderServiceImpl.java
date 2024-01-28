package com.lord.providerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.lord.providerservice.dao.ProviderDao;
import com.lord.providerservice.dto.AddressDto;
import com.lord.providerservice.dto.AddressResponse;
import com.lord.providerservice.dto.ProviderDto;
import com.lord.providerservice.dto.ProviderResponse;
import com.lord.providerservice.mapper.ProviderMapper;
import com.lord.providerservice.model.Provider;

import reactor.core.publisher.Mono;

@Service
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private final ProviderDao providerDao;

	private final WebClient webClient;

	@Autowired
	private final ProviderMapper providerMapper;

	public ProviderServiceImpl(ProviderDao providerDao, WebClient.Builder webClientBuilder,
			ProviderMapper providerMapper) {
		this.providerDao = providerDao;
		this.webClient = webClientBuilder.baseUrl("http://localhost:8090").build();
		this.providerMapper = providerMapper;
	}

	@Override
	public ProviderResponse createProvider(ProviderDto providerDto) {
		Provider provider = providerMapper.toProvider(providerDto);
		Provider savedProvider = providerDao.save(provider);
		AddressResponse addressResponse = providerMapper.dtoToAddressResponse(providerDto,savedProvider.getId());
		AddressResponse savedAddressResponse = saveAddress(addressResponse);

		return providerMapper.toFullProviderResponse(savedProvider, savedAddressResponse);
	}

	@Override
	public AddressResponse getAddressResponse(Long providerId) {
		
		Mono<AddressResponse> response = webClient.get().uri("/api/address/by_provider/{providerId}", providerId)
				.retrieve().bodyToMono(AddressResponse.class);
		if (!response.equals(null)) {
			return response.block();
		}
		return null;
	}

	@Override
	public AddressResponse saveAddress(AddressResponse addressResponse) {
		
		
		Mono<AddressResponse> response = webClient.post().uri("/api/address/")
				.contentType(MediaType.APPLICATION_JSON).bodyValue(addressResponse).retrieve()
				.bodyToMono(AddressResponse.class);
		return response.block();
	}

}
