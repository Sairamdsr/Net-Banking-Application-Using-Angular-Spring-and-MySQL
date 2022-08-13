package com.user.validate.user.controller;

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
    BankService receiverService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/getBankDetails/{BIC}")
    public Banks getBankDetails(@PathVariable("BIC") String BIC) {

        try {
            return receiverService.fetchBankDetails(BIC);
        } catch (Exception e) {
            return null;
        }

    }

}
