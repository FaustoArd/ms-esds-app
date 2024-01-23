package com.lord.addressservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.addressservice.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
