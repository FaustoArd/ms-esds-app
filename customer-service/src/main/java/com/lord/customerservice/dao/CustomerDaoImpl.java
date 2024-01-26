package com.lord.customerservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.customerservice.exception.CustomerNotFoundException;
import com.lord.customerservice.model.Customer;
import com.lord.customerservice.repository.CustomerRepository;

@Service
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private final CustomerRepository customerRepository;
	
	public CustomerDaoImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return (List<Customer>)customerRepository.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer findById(Long id) {
		return customerRepository.findById(id).orElseThrow(()-> new CustomerNotFoundException("Customer not found"));
	}

	@Override
	public void deleteById(Long id)throws CustomerNotFoundException {
		if(customerRepository.existsById(id)) {
			customerRepository.deleteById(id);
		}else {
			throw new CustomerNotFoundException("Customer not found");
		}
		
	}
	

}
