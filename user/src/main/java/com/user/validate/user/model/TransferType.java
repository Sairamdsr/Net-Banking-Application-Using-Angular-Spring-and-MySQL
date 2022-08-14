package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransferType {

    @Id
    @Column(name = "transfercode")
    private String transferTypeCode;
    @Column(name = "transferdescription")
    private String transferTypeDescription;

    public TransferType() {
        super();
    }

    public TransferType(String transferTypeCode, String transferTypeDescription) {
        this.transferTypeCode = transferTypeCode;
        this.transferTypeDescription = transferTypeDescription;
    }

    public String getTransferTypeCode() {
        return transferTypeCode;
    }

    public void setTransferTypeCode(String transferTypeCode) {
        this.transferTypeCode = transferTypeCode;
    }

    public String getTransferTypeDescription() {
        return transferTypeDescription;
    }

    public void setTransferTypeDescription(String transferTypeDescription) {
        this.transferTypeDescription = transferTypeDescription;
    }
}

