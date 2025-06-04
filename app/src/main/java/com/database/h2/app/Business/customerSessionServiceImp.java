package com.database.h2.app.Business;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.h2.app.Repository.CustomerRepository;
import com.database.h2.app.Repository.customerSessionOpenner;
import com.database.h2.app.Service.customerSessionService;
import com.database.h2.app.View.customerSession;
import com.database.h2.app.model.Customer;

@Service
public class customerSessionServiceImp implements customerSessionService{

    @Autowired 
    private customerSessionOpenner cOpenner;

    private Function<Customer,customerSession> maph =
     customer -> new customerSession(customer.getCustomerNumber(), customer.getPassword(),customer.isSessionAlive());

    @Override
    public List<customerSession> openSession() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'openSession'");
    }

    @Override
    public customerSession oSession(String customerNumber) throws Exception {

        return maph.apply(cOpenner.findById(customerNumber)
        .orElseThrow(()->new Exception("Customer not found")));

       
    }



}
