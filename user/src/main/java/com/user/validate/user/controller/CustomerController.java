package com.user.validate.user.controller;

import com.user.validate.user.exception.CurrencyCodeNotFoundException;
import com.user.validate.user.exception.CustomerIdNotFoundException;
import com.user.validate.user.model.Customers;
import com.user.validate.user.service.CustomerService;
import com.user.validate.user.service.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CustomerController {

    @Autowired
    CustomerService customerService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/customerDetails/{customerId}")
    public ResponseEntity<Customers> getCustomerDetails(@PathVariable("customerId") String customerId) throws CustomerIdNotFoundException {

        Customers customer = customerService.fetchCustomerDetails(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK);
//        return customerService.fetchCustomerDetails(customerId);
    }

//    @CrossOrigin("http://localhost:4200/")
//    @PostMapping("/updateBalance/{customerId}/{amount}/{currencyCode}")
//    public ResponseEntity<Status> updateBalance(@PathVariable("customerId") String customerId, @PathVariable("amount") float amount, @PathVariable("currencyCode") String currencyCode) throws CurrencyCodeNotFoundException, CustomerIdNotFoundException {
//
//        Status status = customerService.updateBalance(customerId, amount, currencyCode);
//        return new ResponseEntity<>(status, HttpStatus.ACCEPTED);
//    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/allCustomerDetails")
    public ResponseEntity<List<Customers>> getAllCustomerData(){

        List<Customers> customers = customerService.findAllCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
//        return customerService.fetchCustomerDetails(customerId);

    }
}
