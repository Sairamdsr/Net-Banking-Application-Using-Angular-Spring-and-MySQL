package com.user.validate.user.service;

import com.user.validate.user.exception.*;
import com.user.validate.user.model.Customers;
import com.user.validate.user.model.TempTransactionDetails;
import com.user.validate.user.model.Transaction;
import com.user.validate.user.model.TransferType;
import com.user.validate.user.repository.TempTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TempTransactionService {

    @Autowired
    private TempTransactionRepository tempTransactionRepository;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private BankService bankService;

    @Autowired
    private TransferTypeService transferTypeService;

    @Autowired
    private MessageCodeService messageCodeService;

    @Autowired
    CurrencyService currencyService;

    private final Status status = new Status();

    public Transaction getTransactionDetails(int transactionId) throws InvalidTransactionIdException, CustomerIdNotFoundException, BankBICNotFoundException, CurrencyCodeNotFoundException, TransferTypeNotFoundException, InvalidMessageCodeException {

        Optional<TempTransactionDetails> tempTransactionDetails = tempTransactionRepository.findById(transactionId);
        if (tempTransactionDetails.isEmpty()) throw new InvalidTransactionIdException("Invalid Transaction Id");
        else {

            TempTransactionDetails tempTransactionDetails1 = tempTransactionDetails.get();
            Transaction transaction = new Transaction();
            transaction.setTransactionId(tempTransactionDetails1.getTransactionId());
            transaction.setCustomer(customerService.fetchCustomerDetails(tempTransactionDetails1.getCustomerId()));
            transaction.setCurrency(currencyService.getCurrencyDetails(tempTransactionDetails1.getCurrencyCode()));
            transaction.setReceiverBank(bankService.fetchBankDetails(tempTransactionDetails1.getReceiverBIC()));
            transaction.setReceiverAccountHolderNumber(tempTransactionDetails1.getReceiverAccountHolderNumber());
            transaction.setReceiverAccountHolderName(tempTransactionDetails1.getReceiverAccountHolderName());
            transaction.setTransferType(transferTypeService.getTransferTypeDetails(tempTransactionDetails1.getTransferTypeCode()));
            transaction.setMessage(messageCodeService.getMessageCodeDetails(tempTransactionDetails1.getMessageCode()));
            transaction.setTransferFees(tempTransactionDetails1.getTransferFees());
            transaction.setInrAmount(tempTransactionDetails1.getInrAmount());
            transaction.setTransferDate(tempTransactionDetails1.getTransferDate());

            return transaction;

        }

    }

    public Status setTransactionDetails(TempTransactionDetails tempTransactionDetails) {

        try {

            tempTransactionRepository.save(tempTransactionDetails);
            status.setMessage("Successfully Inserted");
            return status;

        } catch (Exception e) {

            status.setMessage("Unsuccessfull");
            return status;
        }

    }

}
