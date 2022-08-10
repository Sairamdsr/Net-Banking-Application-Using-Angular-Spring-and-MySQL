package com.user.validate.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {

    @Id
    @Column(name = "currencycode")
    private String currencyCode;
    @Column(name = "currencyname")
    private String currencyName;
    @Column(name = "conversionrate")
    private float conversionRate;

    public Currency() {
        super();
    }

    public Currency(String currencyCode, String currencyName, float conversionRate) {
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.conversionRate = conversionRate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public float getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(float conversionRate) {
        this.conversionRate = conversionRate;
    }
}

