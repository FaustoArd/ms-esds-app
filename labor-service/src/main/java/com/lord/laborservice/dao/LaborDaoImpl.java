package com.lord.laborservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lord.laborservice.exception.ItemNotFoundException;
import com.lord.laborservice.model.Labor;
import com.lord.laborservice.repository.LaborRepository;

public class LaborDaoImpl implements ServiceDao<Labor> {
	
	@Autowired
	private final LaborRepository laborRepository;
	
	private static final String itemNotFound = "Item not found";
	
	public LaborDaoImpl(LaborRepository laborRepository) {
		this.laborRepository = laborRepository;
	}

	@Override
	public List<Labor> findAll() {
		return (List<Labor>)laborRepository.findAll();
	}

	@Override
	public Labor save(Labor labor) {
		return laborRepository.save(labor);
	}

	@Override
	public Labor findById(Long id) {
	return laborRepository.findById(id).orElseThrow(()-> new ItemNotFoundException(itemNotFound));
	}

	@Override
	public void deleteById(Long id)throws ItemNotFoundException {
		if(laborRepository.existsById(id)) {
			laborRepository.deleteById(id);
		}else {
			throw new  ItemNotFoundException(itemNotFound);		}
		
	}

}
