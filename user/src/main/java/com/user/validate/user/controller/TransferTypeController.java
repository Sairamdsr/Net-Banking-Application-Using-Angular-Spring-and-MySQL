package com.user.validate.user.controller;

import com.user.validate.user.exception.TransferTypeNotFoundException;
import com.user.validate.user.model.TransferType;
import com.user.validate.user.service.TransferTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferTypeController {

    @Autowired
    TransferTypeService transferTypeService;

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/transferTypeDetails/{transferTypeCode}")
    public ResponseEntity<TransferType> getTransferTypeDetails(@PathVariable("transferTypeCode") String transferTypeCode) throws TransferTypeNotFoundException {

        TransferType transferType = transferTypeService.getTransferTypeDetails(transferTypeCode);
        return new ResponseEntity<>(transferType, HttpStatus.OK);
    }

}

