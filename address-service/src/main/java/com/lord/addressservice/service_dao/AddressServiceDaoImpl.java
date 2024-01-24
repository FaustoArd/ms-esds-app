package com.lord.addressservice.service_dao;

import java.nio.file.ProviderNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.addressservice.exception.AddressNotFoundException;
import com.lord.addressservice.model.Address;
import com.lord.addressservice.repository.AddressRepository;

@Service
public class AddressServiceDaoImpl implements AddressServiceDao {

	@Autowired
	private final AddressRepository addressRepository;
	
	public AddressServiceDaoImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
	}
	
	@Override
	public List<Address> findAll() {
	return (List<Address>)addressRepository.findAll();
	}

	@Override
	public Address findById(Long id) {
		return addressRepository.findById(id).orElseThrow(()-> new AddressNotFoundException("Address not found"));
	}

	@Override
	public Address save(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public void deleteById(Long id)throws AddressNotFoundException {
		if(addressRepository.existsById(id)) {
			addressRepository.deleteById(id);
		}else {
			throw new AddressNotFoundException("Address not found");
		}
		
	}

	@Override
	public Address findByProviderId(Long id) {
		return addressRepository.findByProviderId(id).orElseThrow(()-> new ProviderNotFoundException("Address Not found"));
	}
	
	

}
