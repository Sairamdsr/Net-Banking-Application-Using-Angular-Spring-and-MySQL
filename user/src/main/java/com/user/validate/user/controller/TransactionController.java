package com.user.validate.user.controller;

import com.user.validate.user.model.Transaction;
import com.user.validate.user.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/setTransactionDetails")
    public String setTransactionDetails(@RequestBody Transaction transaction) {

        return transactionService.setTransactionDetails(transaction);
    }

}
