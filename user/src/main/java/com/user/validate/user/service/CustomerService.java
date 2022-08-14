package com.user.validate.user.service;

import com.user.validate.user.exception.CurrencyCodeNotFoundException;
import com.user.validate.user.exception.CustomerIdNotFoundException;
import com.user.validate.user.model.Currency;
import com.user.validate.user.model.Customers;
import com.user.validate.user.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CurrencyService currencyService;
//    private final Status status = new Status();

    public Customers fetchCustomerDetails(String id) throws CustomerIdNotFoundException {

        Optional<Customers> customer = customerRepository.findById(id);

        if (customer.isEmpty()) throw new CustomerIdNotFoundException("Invalid Customer Id");
        else return customer.get();

    }

//    public Status updateBalance(String id, float amount, String currencyCode) throws CurrencyCodeNotFoundException, CustomerIdNotFoundException {
//
//        Optional<Customers> customer = customerRepository.findById(id);
//        if (customer.isEmpty()) throw new CustomerIdNotFoundException("Customer Details Not Found Exception");
//        else {
//            Customers tempCustomer = customer.get();
//            amount = calculateCurrency(currencyCode, amount);
//            amount += taxCalculator(amount);
//            float balance = tempCustomer.getClearBalance() - amount;
//            tempCustomer.setClearBalance(balance);
//            customerRepository.save(tempCustomer);
//            status.setMessage("Success");
//            return status;
//        }
//
//    }

    public List<Customers> findAllCustomers(){

        return customerRepository.findAll();
    }

    public float updateBalance(String customerId, float amount) {

//        try {
            Customers customer = customerRepository.findById(customerId).get();
//            if (Objects.equals(customer.getCustomerId(), customerId)) {
                customer.setClearBalance(amount);
                customerRepository.save(customer);
//                status.setMessage("Success");
//            }
//        } catch (Exception e) {
//            status.setMessage("Unsuccessfull");
//            System.out.println(" ");
//        }

        return customer.getClearBalance();
    }

    public float updateCurrencyCodeValue(Customers customer, String currencyCode, float amount) throws CurrencyCodeNotFoundException {

        float balance = customer.getClearBalance();
        Currency currency = currencyService.getCurrencyDetails(currencyCode);
        balance *= currency.getConversionRate();

        customer.setClearBalance(balance);
        customerRepository.save(customer);

        return customer.getClearBalance();

    }

//    private float taxCalculator(float amount) {
//
//        return (float) ((0.25/100) * amount);
//
//    }

//    private float calculateCurrency(String currencyCode, float amount) throws CurrencyCodeNotFoundException {
//
//        float conversionRate = currencyService.getCurrencyDetails(currencyCode).getConversionRate();
//
//        return amount * conversionRate;
//
//    }
}
