package com.login.service.app.business;

import java.util.Objects;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.login.service.app.model.Customer;
import com.login.service.app.repository.customerRepository;
import com.login.service.app.service.authService;
import com.login.service.app.view.Credentials;
import com.login.service.app.view.Credentials;
@Service
public class authServiceImp implements authService{

    @Autowired
    private customerRepository cRepository;
    BiPredicate<Customer,Credentials> customerValidation =
     (customer,credentials) -> Objects.isNull(customer)
        || !customer.getCustomerNumber().equals(credentials.getCustomerNumber()) 
        || !customer.getPassword().equals(credentials.getPassword());
    
    @Override
    public boolean authenticate( Credentials credentials) throws Exception {
         Customer customer = cRepository.findById(credentials.getCustomerNumber()).orElseThrow(() -> new Exception("Customer not found"));
        if(customerValidation.test(customer, credentials) &&  customer.isSessionAlive()== false && customer.getStatus().equals("A") )
        {
           return false;
        }
        else {
        customer.setSessionAlive(true);
        cRepository.save(customer);
        return true;
        }
    }
}
