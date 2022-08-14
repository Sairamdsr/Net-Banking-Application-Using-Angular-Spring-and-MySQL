package com.user.validate.user.service;

import com.user.validate.user.exception.TransferTypeNotFoundException;
import com.user.validate.user.model.TransferType;
import com.user.validate.user.repository.TransferTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransferTypeService {

    @Autowired
    TransferTypeRepository transferTypeRepository;

    public TransferType getTransferTypeDetails(String transferTypeCode) throws TransferTypeNotFoundException {

        Optional<TransferType> transferType = transferTypeRepository.findById(transferTypeCode);
        if (transferType.isEmpty()) throw new TransferTypeNotFoundException("Invalid Transfer Type");

        return transferType.get();
    }

}
