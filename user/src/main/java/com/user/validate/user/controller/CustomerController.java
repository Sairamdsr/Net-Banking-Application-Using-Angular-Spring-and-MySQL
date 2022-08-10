package com.user.validate.user.controller;

import com.user.validate.user.exception.CurrencyDetailsNotFoundException;
import com.user.validate.user.exception.CustomerDetailsNotFoundException;
import com.user.validate.user.model.Customers;
import com.user.validate.user.service.CustomerService;
import com.user.validate.user.service.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class CustomerController {

    @Autowired
    CustomerService customerService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/getCustomerData/{customerId}")
    public Customers getCustomerData(@PathVariable("customerId") String customerId) throws CustomerDetailsNotFoundException {

        return customerService.fetchCustomerDetails(customerId);

    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/updateBalance/{customerId}/{amount}/{currencyCode}")
    public Status updateBalance(@PathVariable("customerId") String customerId, @PathVariable("amount") float amount, @PathVariable("currencyCode") String currencyCode) throws CurrencyDetailsNotFoundException, CustomerDetailsNotFoundException {

        return customerService.updateBalance(customerId, amount, currencyCode);
    }
}
