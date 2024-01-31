package com.lord.employeeservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.employeeservice.model.Deduction;
import com.lord.employeeservice.model.JobRole;

public interface DeductionRepository extends JpaRepository<Deduction, Long>{
	
	public Optional<Deduction> findByJobRole(JobRole jobRole);

}
