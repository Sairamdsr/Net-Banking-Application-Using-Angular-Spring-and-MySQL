package com.user.validate.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

    @Id
    private int transactionId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;
    @ManyToOne
    @JoinColumn(name = "currency_code")
    private Currency currencyCode;
    @ManyToOne
    @JoinColumn(name = "sender_bic")
    private Banks senderBIC;
    @ManyToOne
    @JoinColumn(name = "receiver_bic")
    private Banks receiverBIC;
    private String receiverAccountHolderNumber;
    private String receiverAccountHolderName;
    @ManyToOne
    @JoinColumn(name = "transfer_type_code")
    private TransferType transferTypeCode;
    @ManyToOne
    @JoinColumn(name = "message_code")
    private MessageCode messageCode;
    private float currencyAmount;
    private float transferFees;
    private float inrAmount;
    private String transferDate;

    public MessageCode getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(MessageCode messageCode) {
        this.messageCode = messageCode;
    }

    public TransferType getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(TransferType transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public Banks getReceiverBIC() {
        return receiverBIC;
    }

    public void setReceiverBIC(Banks receiverBIC) {
        this.receiverBIC = receiverBIC;
    }

    public Banks getSenderBIC() {
        return senderBIC;
    }

    public void setSenderBIC(Banks senderBIC) {
        this.senderBIC = senderBIC;
    }

    public Currency getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Currency currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public Transaction() {
        super();
    }

    public Transaction(int transactionId, Customers customerId, Currency currencyCode, Banks senderBIC, Banks receiverBIC, String receiverAccountHolderNumber, String receiverAccountHolderName, TransferType transferTypeCode, MessageCode messageCode, float currencyAmount, float transferFees, float inrAmount, String transferDate) {
        this.transactionId = transactionId;
        this.customerId = customerId;
        this.currencyCode = currencyCode;
        this.senderBIC = senderBIC;
        this.receiverBIC = receiverBIC;
        this.receiverAccountHolderNumber = receiverAccountHolderNumber;
        this.receiverAccountHolderName = receiverAccountHolderName;
        this.transferTypeCode = transferTypeCode;
        this.messageCode = messageCode;
        this.currencyAmount = currencyAmount;
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

    public float getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(float currencyAmount) {
        this.currencyAmount = currencyAmount;
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
}

