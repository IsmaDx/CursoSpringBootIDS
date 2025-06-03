package com.database.h2.app.Business;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.database.h2.app.Repository.CustomerRepository;
import com.database.h2.app.Service.customerService;
import com.database.h2.app.View.CustomerDTO;
import com.database.h2.app.model.Customer;
@Service
public class customerServiceImp implements customerService{

    @Autowired 
    private CustomerRepository customerRepository;

    //private Function<Customer,CustomerDTO> mapper = this::customerMapper;
    private Function<Customer,CustomerDTO> mapper = customer -> new CustomerDTO(customer.getCustomerName(),customer.getCustomerLastName(),customer.getEmail());

    @Override
    public List<CustomerDTO> getCustomers() {
       // return customerRepository.findAll();
       // List<Customer> customers = customerRepository.findAll();
        //List<CustomerDTO> customerDTOs = new ArrayList<>();
        //for(Customer customer:customers)
        //{  customerDTOs.add(customerMapper(customer));}
        //return customerDTOs;
        return customerRepository.findAll().stream().map(mapper).collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomer(String customerNumber) throws Exception {
        return mapper.apply(customerRepository.findById(customerNumber)
        .orElseThrow(() -> new Exception("Customer not found")));
    }

}
