package com.lord.providerservice.service_dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.providerservice.exception.ProviderNotFoundException;
import com.lord.providerservice.model.Provider;
import com.lord.providerservice.repository.ProviderRepository;

@Service
public class ProviderServiceDaoImpl implements ProviderServiceDao {

	@Autowired
	private final ProviderRepository providerRepository;
	
	public ProviderServiceDaoImpl(ProviderRepository providerRepository) {
		this.providerRepository = providerRepository;
	}
	
	@Override
	public List<Provider> findAll() {
		return (List<Provider>)providerRepository.findAll();
	}

	@Override
	public Provider findById(Long id) {
		return providerRepository.findById(id).orElseThrow(()-> new ProviderNotFoundException("Provider not found"));
	}

	@Override
	public Provider save(Provider provider) {
		return providerRepository.save(provider);
	}

	@Override
	public void deleteById(Long id) throws ProviderNotFoundException {
		if(providerRepository.existsById(id)) {
			providerRepository.deleteById(id);
		}else {
			throw new ProviderNotFoundException("Provider not found");
		}
		
	}

}
