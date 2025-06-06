package com.login.service.app.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="CUSTOMERS")

public class Customer {
@Id
@Column(name="CUSTOMER_NUMBER")
private String customerNumber;
@Column(name="CUSTOMER_PASSWORD")
private String password;
@Column(name="CUSTOMER_SESSION")
private boolean isSessionAlive;
@Column(name = "CUSTOMER_STATUS")
private String status;
}
