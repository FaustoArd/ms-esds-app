package com.lord.distanceservice.dao;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lord.distanceservice.exception.DistanceNotFoundException;
import com.lord.distanceservice.model.Distance;
import com.lord.distanceservice.repository.DistanceRepository;

@Service
public class DistanceDaoImpl implements DistanceDao {
	
	@Autowired
	private final DistanceRepository distanceRepository;
	
	public DistanceDaoImpl(DistanceRepository distanceRepository) {
		this.distanceRepository = distanceRepository;
	}

	@Override
	public Distance findById(ObjectId id) {
		return distanceRepository.findById(id).orElseThrow(()-> new DistanceNotFoundException("Distance not found"));
	}

	@Override
	public Distance save(Distance distance) {
		return distanceRepository.save(distance);
	}

}
