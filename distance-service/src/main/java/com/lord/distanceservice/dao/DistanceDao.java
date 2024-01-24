package com.lord.distanceservice.dao;

import org.bson.types.ObjectId;

import com.lord.distanceservice.model.Distance;

public interface DistanceDao {
	
	public Distance findById(ObjectId id);
	
	public Distance save(Distance distance);

}
