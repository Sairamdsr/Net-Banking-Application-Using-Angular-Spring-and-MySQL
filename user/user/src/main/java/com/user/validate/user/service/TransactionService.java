package com.user.validate.user.service;

import com.user.validate.user.model.Transaction;
import com.user.validate.user.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public String setTransactionDetails(Transaction transaction) {

        try{
            transactionRepository.save(transaction);
        }catch(Exception e) {
            return null;
        }
        return "Success";
    }

}
