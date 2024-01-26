package com.lord.customerservice.dao;

import java.util.List;

import com.lord.customerservice.exception.CustomerNotFoundException;
import com.lord.customerservice.model.Customer;

public interface CustomerDao {
	
	public List<Customer> findAll();
	
	public Customer save(Customer customer);
	
	public Customer findById(Long id);
	
	public void deleteById(Long id)throws CustomerNotFoundException;

}
