package com.user.validate.user.controller;

import com.user.validate.user.exception.BankBICNotFoundException;
import com.user.validate.user.model.Banks;
import com.user.validate.user.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    BankService bankService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/bankDetails/{BIC}")
    public ResponseEntity<Banks> getBankDetails(@PathVariable("BIC") String BIC) throws BankBICNotFoundException {

        Banks bank = bankService.fetchBankDetails(BIC);
        return new ResponseEntity<>(bank, HttpStatus.OK);

    }

}
