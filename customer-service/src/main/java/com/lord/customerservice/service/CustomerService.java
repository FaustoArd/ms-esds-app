package com.lord.customerservice.service;

import java.util.List;

import com.lord.customerservice.dto.CustomerDto;
import com.lord.customerservice.dto.CustomerResponse;
import com.lord.customerservice.model.Address;
import com.lord.customerservice.model.Customer;

public interface CustomerService {
	
	public CustomerResponse createCustomer(CustomerDto customerDto);
	
	public Address saveAddress(CustomerDto customerDto,Long customerId);
	
	public List<CustomerResponse> getCustomersList(List<Customer> customers,List<Address> addresses);

}
