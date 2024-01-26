package com.lord.laborservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lord.laborservice.exception.ItemNotFoundException;
import com.lord.laborservice.model.Distance;
import com.lord.laborservice.repository.DistanceRepository;

public class DistanceDaoImpl implements ServiceDao<Distance> {
	
	@Autowired
	private final DistanceRepository distanceRepository;
	
	private static final String itemNotFound = "Item not found";
	
	public DistanceDaoImpl( DistanceRepository distanceRepository) {
		this.distanceRepository = distanceRepository;
	}

	@Override
	public List<Distance> findAll() {
		return (List<Distance>)distanceRepository.findAll();
	}

	@Override
	public Distance save(Distance distance) {
		return distanceRepository.save(distance);
	}

	@Override
	public Distance findById(Long id) {
		return distanceRepository.findById(id).orElseThrow(()-> new ItemNotFoundException(itemNotFound));
	}

	@Override
	public void deleteById(Long id) throws ItemNotFoundException {
		if(distanceRepository.existsById(id)) {
			distanceRepository.deleteById(id);
		}else {
			throw new ItemNotFoundException(itemNotFound);
		}
		
	}

}
