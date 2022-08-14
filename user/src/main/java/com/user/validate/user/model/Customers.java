package com.user.validate.user.model;

import javax.persistence.*;

@Entity
public class Customers {

    @Id
    @Column(name = "customerid")
    private String customerId;
    @Column(name = "accountholdername")
    private String accountHolderName;
    @Column(name = "overdraftflag")
    private int overDraftFlag;
    @Column(name = "clearbalance")
    private float clearBalance;
    @Column(name = "customeraddress")
    private String customerAddress;
    @Column(name = "customercity")
    private String customerCity;
    @Column(name = "customertype")
    private String customerType;

    public Customers() {
        super();
    }

    public Customers(String customerId, String accountHolderName, int overDraftFlag, float clearBalance, String customerAddress, String customerCity, String customerType) {
        this.customerId = customerId;
        this.accountHolderName = accountHolderName;
        this.overDraftFlag = overDraftFlag;
        this.clearBalance = clearBalance;
        this.customerAddress = customerAddress;
        this.customerCity = customerCity;
        this.customerType = customerType;
    }

    public Customers(String customerId) {

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getOverDraftFlag() {
        return overDraftFlag;
    }

    public void setOverDraftFlag(int overDraftFlag) {
        this.overDraftFlag = overDraftFlag;
    }

    public float getClearBalance() {
        return clearBalance;
    }

    public void setClearBalance(float clearBalance) {
        this.clearBalance = clearBalance;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
}
