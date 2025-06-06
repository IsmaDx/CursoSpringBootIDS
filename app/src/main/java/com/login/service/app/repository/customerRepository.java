package com.login.service.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.service.app.model.Customer;

public interface customerRepository extends JpaRepository<Customer,String> {

}
