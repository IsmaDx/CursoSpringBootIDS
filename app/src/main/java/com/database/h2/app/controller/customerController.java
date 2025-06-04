package com.database.h2.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.h2.app.Repository.CustomerRepository;
import com.database.h2.app.Repository.customerSessionOpenner;
import com.database.h2.app.Service.customerService;
import com.database.h2.app.Service.customerSessionService;
import com.database.h2.app.View.CustomerDTO;
import com.database.h2.app.View.customerSession;
import com.database.h2.app.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")

public class customerController {



    @Autowired
    private CustomerRepository customerRepository;

    @Autowired 
    private customerService customerService;

    @Autowired 
    private customerSessionService cSessionService;

    @Autowired
    private customerSessionOpenner cSessionOpenner;
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

@GetMapping("/newLogin/{customerNumber}/{customerPassword}")
//@PostMapping("/newLogin/{customerNumber}/{customerPassword}")
    //public customerSession openSession(@PathVariable("customerNumber") String customerNumber,@PathVariable("customerPassword") String customerPassword) throws Exception
    public ResponseEntity<String> openSession(@PathVariable("customerNumber") String customerNumber,@PathVariable("customerPassword") String customerPassword) throws Exception
    {
    customerSession cdata = cSessionService.oSession(customerNumber);
    String usr = cdata.getCustomerNumber();
    String psw= cdata.getCustomerPassword();
    boolean session = cdata.getIsSessionAlive();
        if(usr.equals(customerNumber) && psw.equals(customerPassword))
        {   
            if(session == false){
                
            Customer customer = cSessionOpenner.findById(customerNumber).orElseThrow(null);
            customer.setSessionAlive(true);
            cSessionOpenner.save(customer);
             
             UUID sesionuuid = UUID.randomUUID();
            return ResponseEntity.ok()
            .header("SesionID", sesionuuid.toString())
            .body("200 - SESION ABIERTA");
            }
            else
            {
                 return ResponseEntity.status(HttpStatus.CONFLICT)
                .body("409 - SESION YA INICIADA");
            }
        }
        else 
        {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
            .body("401 - NO AUTORIZADO");
        }

    }

}

