package com.lord.addressservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.lord.addressservice.dao.AddressDao;
import com.lord.addressservice.dto.AddressCompleteResultResponse;
import com.lord.addressservice.dto.AddressDto;
import com.lord.addressservice.dto.AddressResponse;
import com.lord.addressservice.mapper.AddressMapper;
import com.lord.addressservice.model.Address;

import jakarta.ws.rs.core.UriBuilder;
import reactor.core.publisher.Mono;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private final AddressDao addressDao;
	
	@Autowired
	private final AddressMapper addressMapper;
	
	private final WebClient webClient;
	
	private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);
	
	public AddressServiceImpl(AddressDao addressServiceDao, AddressMapper addressMapper,WebClient.Builder webClientBuilder) {
		this.addressDao = addressServiceDao;
		this.addressMapper = addressMapper;
		this.webClient = webClientBuilder.baseUrl("http://localhost:8090").build();
	}

	@Override
	public AddressResponse getByProviderId(Long providerId) {
		log.info("Get provider by id");
		Address address = addressDao.findByProviderId(providerId);
		return addressMapper.addressToResponse(address);
	}

	@Override
	public AddressResponse saveAddress(AddressDto addressDto) {
		log.info("Save address");
	Address address = addressMapper.dtoToAddress(addressDto);
	Address savedAddress = addressDao.save(address);
	return addressMapper.addressToResponse(savedAddress);
	}

	@Override
	public List<AddressCompleteResultResponse> getFullAddressesFromTextSearch(String address) {
		Mono<List<AddressCompleteResultResponse>> results = webClient.get().uri("/api/distance/address_search", uriBuilder ->
		uriBuilder.queryParam("query", address).build()).accept(MediaType.APPLICATION_JSON)
				.retrieve().bodyToMono(new ParameterizedTypeReference<List<AddressCompleteResultResponse>>() {
					
				});
		return results.block();
	}
}

