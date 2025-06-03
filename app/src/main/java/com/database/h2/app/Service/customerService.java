package com.database.h2.app.Service;

import java.util.List;

import com.database.h2.app.View.CustomerDTO;
import com.database.h2.app.model.Customer;

public interface customerService {
List<CustomerDTO> getCustomers();
CustomerDTO getCustomer(String customerNumber) throws Exception;
}
