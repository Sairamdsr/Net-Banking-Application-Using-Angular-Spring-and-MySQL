package com.user.validate.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(value = CustomerIdNotFoundException.class)
    public ResponseEntity<ErrorResponse> meth1(CustomerIdNotFoundException customerIdNotFoundException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = customerIdNotFoundException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = BankBICNotFoundException.class)
    public ResponseEntity<ErrorResponse> meth2(BankBICNotFoundException bankBICNotFoundException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = bankBICNotFoundException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = CurrencyCodeNotFoundException.class)
    public ResponseEntity<ErrorResponse> meth3(CurrencyCodeNotFoundException currencyCodeNotFoundException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = currencyCodeNotFoundException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = MessageCodeNotFoundException.class)
    public ResponseEntity<ErrorResponse> meth4(MessageCodeNotFoundException messageCodeNotFoundException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = messageCodeNotFoundException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = TransferTypeNotFoundException.class)
    public ResponseEntity<ErrorResponse> meth5(TransferTypeNotFoundException transferTypeNotFoundException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = transferTypeNotFoundException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = TransactionException.class)
    public ResponseEntity<ErrorResponse> meth6(TransactionException transactionException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = transactionException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = LoggerException.class)
    public ResponseEntity<ErrorResponse> meth7(LoggerException loggerException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = loggerException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = InvalidTransactionIdException.class)
    public ResponseEntity<ErrorResponse> meth8(InvalidTransactionIdException invalidTransactionIdException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = invalidTransactionIdException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = InvalidMessageCodeException.class)
    public ResponseEntity<ErrorResponse> meth9(InvalidMessageCodeException invalidMessageCodeException) {

        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        String message = invalidMessageCodeException.getMessage();
        ErrorResponse errorResponse = new ErrorResponse(httpStatus, message);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
