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

    @Column(name="PASSWORD")
    private String password;

    @Column(name="EMAIL")
    private String email;

    @Column(name="STATUS")
    private String status;

    @Column(name="CREATION")
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

    @Override
    public String toString() {
        return "Customer [customerNumber=" + customerNumber + ", password=" + password + ", email=" + email
                + ", status=" + status + ", creation=" + creation + "]";
    }



}
