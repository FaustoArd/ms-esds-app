package com.lord.laborservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.laborservice.model.Labor;

public interface LaborRepository extends JpaRepository<Labor, Long> {

}
