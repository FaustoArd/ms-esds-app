package com.lord.providerservice.dao;


import java.util.List;

import com.lord.providerservice.exception.ProviderNotFoundException;
import com.lord.providerservice.model.Provider;

public interface ProviderDao {

	public List<Provider> findAll();
	
	public Provider findById(Long id);
	
	public Provider save(Provider provider);
	
	public void deleteById(Long id)throws ProviderNotFoundException;
}
