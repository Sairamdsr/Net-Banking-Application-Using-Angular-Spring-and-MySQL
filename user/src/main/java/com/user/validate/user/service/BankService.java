package com.user.validate.user.service;

import com.user.validate.user.exception.BankDetailsNotFoundException;
import com.user.validate.user.model.Banks;
import com.user.validate.user.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankService {

    @Autowired
    BankRepository receiverRepository;

    public Banks fetchBankDetails(String BIC) throws BankDetailsNotFoundException {

        Optional<Banks> bank = receiverRepository.findById(BIC);

        if (bank.isEmpty()) throw new BankDetailsNotFoundException("Bank Details Not Found");
        else return bank.get();

    }

}
