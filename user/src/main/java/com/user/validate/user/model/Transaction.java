package com.user.validate.user.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    @ManyToOne
    @JoinColumn(name = "customer")
    private Customers customer;
    @ManyToOne
    @JoinColumn(name = "currency")
    private Currency currency;
//    @ManyToOne
//    @JoinColumn(name = "sender_bic")
//    private Banks senderBIC;
    @ManyToOne
    @JoinColumn(name = "bank")
    private Banks bank;
    private String receiverAccountHolderNumber;
    private String receiverAccountHolderName;
    @ManyToOne
    @JoinColumn(name = "transfer_type")
    private TransferType transferType;
    @ManyToOne
    @JoinColumn(name = "message")
    private MessageCode message;
//    private float currencyAmount;
    private float transferFees;
    private float inrAmount;
    private String transferDate;

    public MessageCode getMessage() {
        return message;
    }

    public void setMessage(MessageCode message) {
        this.message = message;
    }

    public TransferType getTransferType() {
        return transferType;
    }

    public void setTransferType(TransferType transferType) {
        this.transferType = transferType;
    }

    public Banks getReceiverBank() {
        return bank;
    }

    public void setReceiverBank(Banks bank) {
        this.bank = bank;
    }

//    public Banks getSenderBIC() {
//        return senderBIC;
//    }

//    public void setSenderBIC(Banks senderBIC) {
//        this.senderBIC = senderBIC;
//    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public Transaction() {
        super();
    }

    public Transaction(int transactionId, Customers customer, Currency currency, Banks bank, String receiverAccountHolderNumber, String receiverAccountHolderName, TransferType transferType, MessageCode message, float transferFees, float inrAmount, String transferDate) {
        this.transactionId = transactionId;
        this.customer = customer;
        this.currency = currency;
//        this.senderBIC = senderBIC;
        this.bank = bank;
        this.receiverAccountHolderNumber = receiverAccountHolderNumber;
        this.receiverAccountHolderName = receiverAccountHolderName;
        this.transferType = transferType;
        this.message = message;
//        this.currencyAmount = currencyAmount;
        this.transferFees = transferFees;
        this.inrAmount = inrAmount;
        this.transferDate = transferDate;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
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

//    public float getCurrencyAmount() {
//        return currencyAmount;
//    }

//    public void setCurrencyAmount(float currencyAmount) {
//        this.currencyAmount = currencyAmount;
//    }

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
}

