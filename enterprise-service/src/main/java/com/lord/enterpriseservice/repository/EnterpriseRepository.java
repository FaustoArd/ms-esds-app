package com.lord.enterpriseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.enterpriseservice.model.Enterprise;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

}
