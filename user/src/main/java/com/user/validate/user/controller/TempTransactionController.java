package com.user.validate.user.controller;

import com.user.validate.user.exception.*;
import com.user.validate.user.model.TempTransactionDetails;
import com.user.validate.user.model.Transaction;
import com.user.validate.user.service.Status;
import com.user.validate.user.service.TempTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TempTransactionController {

    @Autowired
    TempTransactionService tempTransactionService;

    @GetMapping("/getTransactionDetails/{transactionId}")
    public ResponseEntity<Transaction> getTransactionDetails(@PathVariable("transactionId") int transactionId) throws InvalidTransactionIdException, CustomerIdNotFoundException, BankBICNotFoundException, CurrencyCodeNotFoundException, TransferTypeNotFoundException, InvalidMessageCodeException {

        Transaction transactionDetails = tempTransactionService.getTransactionDetails(transactionId);
        return new ResponseEntity<>(transactionDetails, HttpStatus.OK);

    }

    @RequestMapping("/setTransactionDetails")
    public ResponseEntity<Status> setTransactionDetails(@RequestBody TempTransactionDetails tempTransactionDetails) {

        Status status = tempTransactionService.setTransactionDetails(tempTransactionDetails);
        return new ResponseEntity<>(status, HttpStatus.CREATED);

    }

}
