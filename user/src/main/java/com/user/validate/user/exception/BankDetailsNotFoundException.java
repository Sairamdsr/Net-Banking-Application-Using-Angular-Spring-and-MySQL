package com.user.validate.user.exception;

public class BankDetailsNotFoundException extends Exception {

    public BankDetailsNotFoundException() { super(); }

    public BankDetailsNotFoundException(String exception) { super(exception); }

    public BankDetailsNotFoundException(Exception exception) { super(exception); }

}
