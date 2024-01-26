package com.lord.customerservice.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lord.customerservice.dto.CustomerDto;
import com.lord.customerservice.dto.CustomerResponse;
import com.lord.customerservice.model.Address;
import com.lord.customerservice.model.Customer;

@Component
public class CustomerMapperImpl implements CustomerMapper {

	@Override
	public Address dtoToAddress(CustomerDto customerDto, Long customerId) {
		if (customerDto == null) {
			return null;
		}
		Address address = new Address();
		address.setStreet(customerDto.getAddress().getStreet());
		address.setCustomerId(customerId);
		address.setHouseNumber(customerDto.getAddress().getHouseNumber());
		address.setgMapsFullname(customerDto.getAddress().getgMapsFullname());
		address.setLocality(customerDto.getAddress().getLocality());
		address.setCity(customerDto.getAddress().getCity());

		return address;
	}

	@Override
	public Customer dtoToCustomer(CustomerDto customerDto) {
		if (customerDto == null) {
			return null;
		}
		Customer customer = new Customer();
		customer.setName(customerDto.getName());
		customer.setSocialName(customerDto.getSocialName());
		customer.setType(customerDto.getType());
		customer.setCuit(customerDto.getCuit());
		customer.setEmail(customerDto.getEmail());
		customer.setPhone(customerDto.getPhone());

		return customer;
	}

	@Override
	public CustomerResponse toCustomerResponse(Customer customer) {
		if (customer == null) {
			return null;
		}
		CustomerResponse response = new CustomerResponse();
		response.setId(customer.getId());
		response.setName(customer.getName());
		response.setSocialName(customer.getSocialName());
		response.setType(customer.getType());
		response.setCuit(customer.getCuit());
		response.setEmail(customer.getEmail());
		response.setPhone(customer.getPhone());
		

		return response;
	}

	@Override
	public List<CustomerResponse> toCustomersResponse(List<Customer> customers) {
		if (customers == null) {
			return null;
		}
		List<CustomerResponse> customersResponse = customers.stream().map(this::toCustomerResponse).toList();
		return customersResponse;
	}

}
