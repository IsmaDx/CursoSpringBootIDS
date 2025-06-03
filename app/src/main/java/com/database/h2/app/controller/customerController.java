package com.database.h2.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.h2.app.Repository.CustomerRepository;
import com.database.h2.app.Service.customerService;
import com.database.h2.app.View.CustomerDTO;
import com.database.h2.app.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")

public class customerController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired 
    private customerService customerService;

@GetMapping("/Customers")
public List<CustomerDTO> getCustomers()
    {

    //@RequestParam (name="starus", required = false)String status)
    
    //return customerRepository.findAll();
    //if(Objects.nonNull(status))
    //{return customerRepository.findByStatus(status);}
    //return customerRepository.findAll();
    return customerService.getCustomers();
}

@GetMapping("/Customers/{customerNumber}")
 public CustomerDTO getCustomer(@PathVariable("customerNumber") String customerNumber)
    throws Exception
    {
        //return customerRepository.findById(customerNumber).orElseThrow(()->new Exception("Customer not found"));
        return customerService.getCustomer(customerNumber);
    }
}
