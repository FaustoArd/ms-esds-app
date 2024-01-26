package com.lord.laborservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lord.laborservice.exception.ItemNotFoundException;
import com.lord.laborservice.model.Supply;
import com.lord.laborservice.repository.SupplyRepository;

public class SupplyDaoImpl implements ServiceDao<Supply> {
	
	@Autowired
	private final SupplyRepository supplyRepository;
	
	private static final String itemNotFound = "Item not found";
	
	public SupplyDaoImpl(SupplyRepository supplyRepository) {
		this.supplyRepository = supplyRepository;
	}

	@Override
	public List<Supply> findAll() {
		return (List<Supply>)supplyRepository.findAll();
	}

	@Override
	public Supply save(Supply supply) {
		return supplyRepository.save(supply);
	}

	@Override
	public Supply findById(Long id) {
		return supplyRepository.findById(id).orElseThrow(()-> new ItemNotFoundException(itemNotFound));
	}

	@Override
	public void deleteById(Long id) throws ItemNotFoundException {
		if(supplyRepository.existsById(id)) {
			supplyRepository.deleteById(id);
		}else {
			throw new ItemNotFoundException(itemNotFound);
		}
		
	}

}
