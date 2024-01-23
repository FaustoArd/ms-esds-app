package com.lord.customerservice.service_dao;

import java.util.List;

import com.lord.customerservice.model.Customer;

public interface CustomerServiceDao {
	
	public List<Customer> findAll();
	
	public Customer save(Customer customer);
	
	public Customer findById(Long id);
	
	public void deleteById(Long id);

}
