package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Banks {

    @Id
    @Column(name = "bic")
    private String BIC;
    @Column(name = "bankname")
    private String bankName;

    public Banks() {
        super();
    }

    public Banks(String BIC, String bankName) {
        this.BIC = BIC;
        this.bankName = bankName;
    }

    public String getBIC() {
        return BIC;
    }

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
