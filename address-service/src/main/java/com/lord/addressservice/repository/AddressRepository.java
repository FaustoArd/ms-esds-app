package com.lord.addressservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lord.addressservice.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

	public Optional<Address> findByProviderId(Long providerId);
}
