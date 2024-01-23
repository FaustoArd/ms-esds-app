package com.lord.providerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.providerservice.model.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long>{

}
