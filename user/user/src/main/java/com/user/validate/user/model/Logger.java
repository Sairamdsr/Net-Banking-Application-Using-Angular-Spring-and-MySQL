package com.user.validate.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Logger {

    @Id
    private long loggerId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;
    private int userId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employeeId;
    private String screenName;
    private String action;
    private String ipAddress;

    public Employee getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employee employeeId) {
        this.employeeId = employeeId;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public Logger() {
        super();
    }

    public Logger(long loggerId, Customers customerId, int userId, Employee employeeId, String screenName, String action, String ipAddress) {
        this.loggerId = loggerId;
        this.customerId = customerId;
        this.userId = userId;
        this.employeeId = employeeId;
        this.screenName = screenName;
        this.action = action;
        this.ipAddress = ipAddress;
    }

    public long getLoggerId() {
        return loggerId;
    }

    public void setLoggerId(long loggerId) {
        this.loggerId = loggerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}

