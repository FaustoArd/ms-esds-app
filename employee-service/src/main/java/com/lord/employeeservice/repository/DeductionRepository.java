package com.lord.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.employeeservice.model.Deduction;

public interface DeductionRepository extends JpaRepository<Deduction, Long>{

}
