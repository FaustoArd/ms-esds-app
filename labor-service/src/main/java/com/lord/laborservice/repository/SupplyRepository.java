package com.lord.laborservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.laborservice.model.Supply;

public interface SupplyRepository extends JpaRepository<Supply, Long> {

}
