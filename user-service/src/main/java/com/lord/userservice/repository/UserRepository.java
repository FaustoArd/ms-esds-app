package com.lord.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lord.userservice.model.UserApp;

public interface UserRepository extends JpaRepository<UserApp, Long> {

}
