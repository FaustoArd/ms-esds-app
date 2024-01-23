package com.lord.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.customerservice.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
