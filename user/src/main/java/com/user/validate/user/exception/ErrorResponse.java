package com.user.validate.user.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorResponse {

    Date date;
    int code;
    String status;
    String message;

    public ErrorResponse() {
        super();
        date = new Date();
    }

    public ErrorResponse(HttpStatus httpStatus, String message) {
        super();
        date = new Date();
        this.code = httpStatus.value();
        this.status = httpStatus.name();
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
