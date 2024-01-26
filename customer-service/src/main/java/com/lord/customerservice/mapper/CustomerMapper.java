package com.lord.customerservice.mapper;

import java.util.List;

import com.lord.customerservice.dto.CustomerDto;
import com.lord.customerservice.dto.CustomerResponse;
import com.lord.customerservice.model.Address;
import com.lord.customerservice.model.Customer;

public interface CustomerMapper {
	
	public Address dtoToAddress(CustomerDto customerDto,Long customerId);
	
	public Customer dtoToCustomer(CustomerDto customerDto);
	
	public CustomerResponse toCustomerResponse(Customer customer);
	
	public List<CustomerResponse> toCustomersResponse(List<Customer> customers);

}
