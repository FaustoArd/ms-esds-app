package com.lord.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.lord.customerservice.dao.CustomerDao;
import com.lord.customerservice.dto.CustomerDto;
import com.lord.customerservice.dto.CustomerResponse;
import com.lord.customerservice.mapper.CustomerMapper;
import com.lord.customerservice.model.Address;
import com.lord.customerservice.model.Customer;

import reactor.core.publisher.Mono;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private final CustomerDao customerDao;
	
	private final WebClient webClient;
	
	@Autowired
	private final CustomerMapper customerMapper;
	
	public CustomerServiceImpl(CustomerDao customerDao,WebClient.Builder webClientBuilder,CustomerMapper customerMapper) {
		this.customerDao = customerDao;
		this.webClient = webClientBuilder.baseUrl("http://localhost:8090").build();
		this.customerMapper = customerMapper;
	}

	@Override
	public CustomerResponse createCustomer(CustomerDto customerDto) {
		Customer customer = customerMapper.dtoToCustomer(customerDto);
		Customer savedCustomer = customerDao.save(customer);
		Address address = saveAddress(customerDto, savedCustomer.getId());
		CustomerResponse customerResponse = customerMapper.toCustomerResponse(savedCustomer);
		customerResponse.setAddress(address);
		return customerResponse;
	}

	@Override
	public Address saveAddress(CustomerDto customerDto,Long customerId) {
		Address address = customerMapper.dtoToAddress(customerDto, customerId);
		Mono<Address> result = webClient.post().uri("/api/address/").contentType(MediaType.APPLICATION_JSON)
				.bodyValue(address)
				.retrieve()
				.bodyToMono(Address.class);
		return result.block();
	}

	@Override
	public List<CustomerResponse> getCustomersList(List<Customer> customers,List<Address> addresses) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
