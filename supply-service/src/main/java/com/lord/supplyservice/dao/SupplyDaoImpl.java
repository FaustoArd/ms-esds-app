package com.lord.supplyservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.supplyservice.exception.SupplyNotFoundException;
import com.lord.supplyservice.model.Supply;
import com.lord.supplyservice.repository.SupplyRepository;

@Service
public class SupplyDaoImpl implements SupplyDao{
	
	@Autowired
	private final SupplyRepository supplyRepository;
	
	private static final String supplyNotFound ="Supply not found";
	
	public SupplyDaoImpl(SupplyRepository supplyRepository) {
		this.supplyRepository = supplyRepository;
	}

	@Override
	public Supply save(Supply supply) {
		return supplyRepository.save(supply);
	}

	@Override
	public Supply findById(Long id)throws SupplyNotFoundException {
		return supplyRepository.findById(id).orElseThrow(()-> new SupplyNotFoundException(supplyNotFound));
	}
	
	@Override
	public List<Supply> findByProviderId(Long providerId) {
		return supplyRepository.findByProviderId(providerId);
	}

	@Override
	public List<Supply> findAll() {
		return ( List<Supply> ) supplyRepository.findAll();
	}

	@Override
	public void deleteById(Long id)throws SupplyNotFoundException {
		if(supplyRepository.existsById(id)) {
			supplyRepository.deleteById(id);
		}else {
			throw new SupplyNotFoundException(supplyNotFound);
		}
		
	}

	
	
	

}
