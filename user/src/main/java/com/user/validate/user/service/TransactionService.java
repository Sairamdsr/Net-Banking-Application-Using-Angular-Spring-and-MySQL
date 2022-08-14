package com.user.validate.user.service;

import com.user.validate.user.exception.InvalidTransactionIdException;
import com.user.validate.user.model.Transaction;
import com.user.validate.user.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    CustomerService customerService;

    @Autowired
    CurrencyService currencyService;

    @Autowired
    TransferTypeService transferTypeService;

    Status status = new Status();

//    public Transaction setTransactionDetails(Transaction transaction) throws Exception {
//
//        Customers customer = customerService.fetchCustomerDetails(transaction.getCustomerId().getCustomerId());
//        float updatedAmount = customerService.updateCurrencyCodeValue(customer, transaction.getCurrencyCode().getCurrencyCode(), transaction.getInrAmount());
//        customer.setClearBalance(transaction.getTransferFees() + customer.getClearBalance());
//        float amountAfterTax = customerService.updateBalance(customer.getCustomerId(), updatedAmount);
//
////        if (Objects.equals(status.getMessage(), "Unsuccessfull")) {
////
////            throw new Exception("Error Occurred While Updating");
////        }
//
//        return transactionRepository.save(transaction);
//
//    }

    public Transaction getTransactionDetails(int transactionId) throws InvalidTransactionIdException {

        Optional<Transaction> transaction = transactionRepository.findById(transactionId);
        if (transaction.isEmpty()) throw new InvalidTransactionIdException("Invalid Transaction Id");
        else return transaction.get();

    }

    public Status setTransactionDetails(Transaction transaction) {

//        TransferType transferType = transaction.getTransferTypeCode();
//        System.out.println(transferType.getTransferTypeCode())

        try {

            transactionRepository.save(transaction);
            status.setMessage("Successfully Inserted");
            return status;

        } catch (Exception e) {

            status.setMessage("Unsuccessfull");
            return status;

        }

    }

}
