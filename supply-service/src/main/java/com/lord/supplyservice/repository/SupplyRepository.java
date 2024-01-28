package com.lord.supplyservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.supplyservice.model.Supply;

public interface SupplyRepository extends JpaRepository<Supply, Long> {
	
	public List<Supply> findByProviderId(Long id);

}
