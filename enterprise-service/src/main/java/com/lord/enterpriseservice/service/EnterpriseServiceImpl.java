package com.lord.enterpriseservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.lord.enterpriseservice.dao.EnterpriseDao;
import com.lord.enterpriseservice.dto.EnterpriseCreateResponse;
import com.lord.enterpriseservice.dto.EnterpriseDto;
import com.lord.enterpriseservice.dto.EnterpriseResponse;
import com.lord.enterpriseservice.mapper.EnterpriseMapper;
import com.lord.enterpriseservice.model.Address;
import com.lord.enterpriseservice.model.Enterprise;

import reactor.core.publisher.Mono;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {
	
	@Autowired
	private final EnterpriseDao enterpriseDao;
	
	@Autowired
	private final EnterpriseMapper enterpriseMapper;
	
	private final WebClient webClient;

	public EnterpriseServiceImpl(EnterpriseDao enterpriseDao,EnterpriseMapper enterpriseMapper
			,WebClient.Builder webClientBuilder) {
		this.enterpriseDao = enterpriseDao;
		this.enterpriseMapper = enterpriseMapper;
		this.webClient = webClientBuilder.baseUrl("http://localhost:8090").build();
	}

	@Override
	public EnterpriseCreateResponse createEnterprise(EnterpriseDto enterpriseDto) {
		Enterprise enterprise = enterpriseMapper.dtoToEnterprise(enterpriseDto);
		Address address = createAddress(enterpriseDto.getAddress());
		enterprise.setAddressId(address.getId());
		Enterprise savedEnterprise = enterpriseDao.save(enterprise);
		return enterpriseMapper.enterpriseToEnterpriseCreateResponse(savedEnterprise);
	}

	@Override
	public EnterpriseResponse findEnterpriseById(Long id) {
		Enterprise enterprise = enterpriseDao.findById(id);
		Address address = findAddress(enterprise.getAddressId());
		return enterpriseMapper.enterpriseToFullResponse(enterprise, address);
	}

	@Override
	public Address createAddress(Address address) {
		Mono<Address> response = webClient.post().uri("/api/address/")
				.contentType(MediaType.APPLICATION_JSON).bodyValue(address).retrieve()
				.bodyToMono(Address.class);
		return response.block();
	}

	@Override
	public Address findAddress(Long addressId) {
	Mono<Address> response = webClient.get().uri("/api/address/by_id/{id}").retrieve().bodyToMono(Address.class);
	return response.block();
	}

	@Override
	public List<EnterpriseResponse> findEnterprisesByUserId(Long id) {
		List<Enterprise> enterprises = enterpriseDao.findAll();
		return enterpriseMapper.enterprisesToResponses(enterprises);
	}
	
	

}
