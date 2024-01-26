package com.lord.laborservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.laborservice.model.Distance;

public interface DistanceRepository extends JpaRepository<Distance, Long> {

}
