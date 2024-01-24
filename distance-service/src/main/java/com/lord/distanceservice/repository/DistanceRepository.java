package com.lord.distanceservice.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.lord.distanceservice.model.Distance;

public interface DistanceRepository extends MongoRepository<Distance, ObjectId> {

}
