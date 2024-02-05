package com.lord.employeeservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lord.employeeservice.model.Fortnight;

public interface ForthNightRepository extends JpaRepository<Fortnight, Long> {

	public List<Fortnight> findByEnterpriseId(Long enterpriseId);
}
