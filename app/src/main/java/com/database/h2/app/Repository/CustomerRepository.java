package com.database.h2.app.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.database.h2.app.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,String> {
    List<Customer> findByStatus(String status);
    //List<Customer> findByStatusAndCreation(String status,String Creation);
}
