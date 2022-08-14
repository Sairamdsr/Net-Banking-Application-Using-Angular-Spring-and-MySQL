package com.user.validate.user.exception;

public class TransactionException extends Exception {

    public TransactionException() { super(); }

    public TransactionException(String exception) { super(exception); }

    public TransactionException(Exception exception) { super(exception); }

}
