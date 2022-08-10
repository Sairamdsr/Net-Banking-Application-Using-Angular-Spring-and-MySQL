package com.user.validate.user.exception;

public class LoggerException extends Exception {

    public LoggerException() { super(); }

    public LoggerException(String exception) { super(exception); }

    public LoggerException(Exception exception){ super(exception); }

}
