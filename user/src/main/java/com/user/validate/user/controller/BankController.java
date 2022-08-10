package com.user.validate.user.controller;

import com.user.validate.user.exception.BankDetailsNotFoundException;
import com.user.validate.user.model.Banks;
import com.user.validate.user.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    BankService bankService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/getBankDetails/{BIC}")
    public Banks getBankDetails(@PathVariable("BIC") String BIC) throws BankDetailsNotFoundException {

        return bankService.fetchBankDetails(BIC);

    }

}
