package com.user.validate.user.service;

import com.user.validate.user.model.Customers;
import com.user.validate.user.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository userRepository;

    @Autowired
    CurrencyService currencyService;
    private final Status status = new Status();

    public Customers fetchCustomerDetails(String id) {

        return userRepository.findById(id).get();

    }

    public Status updateBalance(String id, float amount, String currencyCode) {

        try {
            Customers customer = userRepository.findById(id).get();
//            System.out.println("Before Amount is: "+ amount);
            amount = calculateCurrency(currencyCode, amount);
//            System.out.println("After Calculating Currency, Amount is: "+ amount);
            amount += taxCalculator(amount);
//            System.out.println("After Calculating Tax, Amount is: "+ amount);
            float balance = customer.getClearBalance() - amount;
            customer.setClearBalance(balance);
            userRepository.save(customer);
            status.setMessage("Success");
            return status;
        } catch (Exception e) {
            System.out.println();
        }

        status.setMessage("Unsuccessfull");
        return status;
    }

    private float taxCalculator(float amount) {

        return (float) ((0.25/100) * amount);

    }

    private float calculateCurrency(String currencyCode, float amount) {

        float conversionRate = currencyService.getCurrencyDetails(currencyCode).getConversionRate();

        return amount * conversionRate;

    }
}
