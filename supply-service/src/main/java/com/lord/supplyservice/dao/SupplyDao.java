package com.lord.supplyservice.dao;

import java.util.List;

import com.lord.supplyservice.exception.SupplyNotFoundException;
import com.lord.supplyservice.model.Supply;

public interface SupplyDao {
	
	public Supply save(Supply supply);
	
	public Supply findById(Long id)throws SupplyNotFoundException;
	
	public List<Supply> findByProviderId(Long providerId);
	
	public List<Supply> findAll();
	
	public void deleteById(Long id)throws SupplyNotFoundException;
	
	

}
