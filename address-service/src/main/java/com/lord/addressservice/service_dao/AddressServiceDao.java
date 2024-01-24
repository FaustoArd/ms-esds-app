package com.lord.addressservice.service_dao;

import java.util.List;

import com.lord.addressservice.exception.AddressNotFoundException;
import com.lord.addressservice.model.Address;

public interface AddressServiceDao {
	
	public List<Address> findAll();
	
	public Address findById(Long id);
	
	public Address save(Address address);
	
	public void deleteById(Long id) throws AddressNotFoundException ;
	
	public Address findByProviderId(Long id);

}
