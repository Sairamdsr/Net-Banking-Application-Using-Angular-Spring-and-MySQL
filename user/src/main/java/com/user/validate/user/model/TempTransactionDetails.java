package com.user.validate.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TempTransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private String customerId;
    private String receiverBIC;
    private String receiverAccountHolderNumber;
    private String receiverAccountHolderName;
    private String transferTypeCode;
    private String messageCode;
    private float transferFees;
    private float inrAmount;
    private String transferDate;
    private String currencyCode;

    public TempTransactionDetails() { super(); }

    public TempTransactionDetails(int transactionId, String customerId, String receiverBIC, String receiverAccountHolderNumber, String receiverAccountHolderName, String transferTypeCode, String messageCode, float transferFees, float inrAmount, String transferDate, String currencyCode) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.receiverBIC = receiverBIC;
        this.receiverAccountHolderNumber = receiverAccountHolderNumber;
        this.receiverAccountHolderName = receiverAccountHolderName;
        this.transferTypeCode = transferTypeCode;
        this.messageCode = messageCode;
        this.transferFees = transferFees;
        this.inrAmount = inrAmount;
        this.transferDate = transferDate;
        this.currencyCode = currencyCode;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getReceiverBIC() {
        return receiverBIC;
    }

    public void setReceiverBIC(String receiverBIC) {
        this.receiverBIC = receiverBIC;
    }

    public String getReceiverAccountHolderNumber() {
        return receiverAccountHolderNumber;
    }

    public void setReceiverAccountHolderNumber(String receiverAccountHolderNumber) {
        this.receiverAccountHolderNumber = receiverAccountHolderNumber;
    }

    public String getReceiverAccountHolderName() {
        return receiverAccountHolderName;
    }

    public void setReceiverAccountHolderName(String receiverAccountHolderName) {
        this.receiverAccountHolderName = receiverAccountHolderName;
    }

    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(String transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public String getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(String messageCode) {
        this.messageCode = messageCode;
    }

    public float getTransferFees() {
        return transferFees;
    }

    public void setTransferFees(float transferFees) {
        this.transferFees = transferFees;
    }

    public float getInrAmount() {
        return inrAmount;
    }

    public void setInrAmount(float inrAmount) {
        this.inrAmount = inrAmount;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public String getCurrencyCode() { return currencyCode; }

    public void setCurrencyCode(String currencyCode) { this.currencyCode = currencyCode; }
}
