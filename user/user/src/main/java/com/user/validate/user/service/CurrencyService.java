package com.user.validate.user.service;

import com.user.validate.user.model.Currency;
import com.user.validate.user.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    public Currency getCurrencyDetails(String currencyCode) {

        return currencyRepository.findById(currencyCode).get();

    }

}
