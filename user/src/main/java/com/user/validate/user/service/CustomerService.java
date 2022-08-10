package com.user.validate.user.service;

import com.user.validate.user.exception.CurrencyDetailsNotFoundException;
import com.user.validate.user.exception.CustomerDetailsNotFoundException;
import com.user.validate.user.model.Customers;
import com.user.validate.user.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CurrencyService currencyService;
    private final Status status = new Status();

    public Customers fetchCustomerDetails(String id) throws CustomerDetailsNotFoundException {

        Optional<Customers> customer = customerRepository.findById(id);

        if (customer.isEmpty()) throw new CustomerDetailsNotFoundException("Customer Details Not Found");
        else return customer.get();

    }

    public Status updateBalance(String id, float amount, String currencyCode) throws CurrencyDetailsNotFoundException, CustomerDetailsNotFoundException {

        Optional<Customers> customer = customerRepository.findById(id);
        if (customer.isEmpty()) throw new CustomerDetailsNotFoundException("Customer Details Not Found Exception");
        else {
            Customers tempCustomer = customer.get();
            amount = calculateCurrency(currencyCode, amount);
            amount += taxCalculator(amount);
            float balance = tempCustomer.getClearBalance() - amount;
            tempCustomer.setClearBalance(balance);
            customerRepository.save(tempCustomer);
            status.setMessage("Success");
            return status;
        }

    }

    private float taxCalculator(float amount) {

        return (float) ((0.25/100) * amount);

    }

    private float calculateCurrency(String currencyCode, float amount) throws CurrencyDetailsNotFoundException {

        float conversionRate = currencyService.getCurrencyDetails(currencyCode).getConversionRate();

        return amount * conversionRate;

    }
}
