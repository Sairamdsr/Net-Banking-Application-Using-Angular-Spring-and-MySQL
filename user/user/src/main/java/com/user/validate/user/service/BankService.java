package com.user.validate.user.service;

import com.user.validate.user.model.Banks;
import com.user.validate.user.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    BankRepository receiverRepository;

    public Banks fetchBankDetails(String BIC) {

        return receiverRepository.findById(BIC).get();
    }

}
