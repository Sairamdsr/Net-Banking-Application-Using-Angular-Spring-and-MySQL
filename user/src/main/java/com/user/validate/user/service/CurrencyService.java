package com.user.validate.user.service;

import com.user.validate.user.exception.CurrencyDetailsNotFoundException;
import com.user.validate.user.model.Currency;
import com.user.validate.user.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    public Currency getCurrencyDetails(String currencyCode) throws CurrencyDetailsNotFoundException {

        Optional<Currency> currency = currencyRepository.findById(currencyCode);

        if (currency.isEmpty()) throw new CurrencyDetailsNotFoundException("Currency Details Not Found");
        else return currency.get();

    }

}
