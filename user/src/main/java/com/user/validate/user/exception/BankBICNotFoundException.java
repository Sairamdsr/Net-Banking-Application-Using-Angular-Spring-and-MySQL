package com.user.validate.user.exception;

public class BankBICNotFoundException extends Exception {

    public BankBICNotFoundException() { super(); }

    public BankBICNotFoundException(String exception) { super(exception); }

    public BankBICNotFoundException(Exception exception) { super(exception); }

}
