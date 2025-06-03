package com.database.h2.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    @Id
    @Column(name="CUSTOMER_NUMBER")
    private String customerNumber;

    @Column(name="CUSTOMER_NAME")
    private String customerName;

    @Column(name="CUSTOMER_LASTNAME")
    private String customerLastName;

    @Column(name="CUSTOMER_SESSION")
    private boolean isSessionAlive;

    @Column(name="CUSTOMER_PASSWORD")
    private String password;

    @Column(name="CUSTOMER_EMAIL")
    private String email;

    @Column(name="CUSTOMER_STATUS")
    private String status;

    @Column(name="CUSTOMER_CREATION")
    private String creation;

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getStatus() {
        return status;
    }

    public String getCreation() {
        return creation;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCreation(String creation) {
        this.creation = creation;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public boolean isSessionAlive() {
        return isSessionAlive;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public void setSessionAlive(boolean isSessionAlive) {
        this.isSessionAlive = isSessionAlive;
    }

    @Override
    public String toString() {
        return "Customer [customerNumber=" + customerNumber + ", customerName=" + customerName + ", customerLastName="
                + customerLastName + ", isSessionAlive=" + isSessionAlive + ", password=" + password + ", email="
                + email + ", status=" + status + ", creation=" + creation + "]";
    }



}
