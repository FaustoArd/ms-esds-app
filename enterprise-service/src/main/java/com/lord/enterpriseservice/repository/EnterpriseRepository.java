package com.lord.enterpriseservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.enterpriseservice.model.Enterprise;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

	public List<Enterprise> findEnterpriseByUserId(Long id);
}
