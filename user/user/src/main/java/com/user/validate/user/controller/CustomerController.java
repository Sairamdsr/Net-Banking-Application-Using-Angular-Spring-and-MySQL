package com.user.validate.user.controller;

import com.user.validate.user.model.Customers;
import com.user.validate.user.service.CustomerService;
import com.user.validate.user.service.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class CustomerController {

    @Autowired
    CustomerService userService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/getSenderData/{customerId}")
    public Customers getCustomerData(@PathVariable("customerId") String customerId) throws Exception {

        try {
            return userService.fetchCustomerDetails(customerId);
        } catch (Exception e) {
            System.out.println("");
        }

        return null;
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/updateBalance/{customerId}/{amount}/{currencyCode}")
    public Status updateBalance(@PathVariable("customerId") String customerId, @PathVariable("amount") float amount, @PathVariable("currencyCode") String currencyCode) {

        return userService.updateBalance(customerId, amount, currencyCode);
    }
}
