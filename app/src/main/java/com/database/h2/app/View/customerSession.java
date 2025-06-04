package com.database.h2.app.View;

public class customerSession {
private String customerNumber;
private String customerPassword;
private boolean isSessionAlive;

public customerSession(String customerNumber, String customerPassword, boolean isSessionAlive) {
    this.customerNumber = customerNumber;
    this.customerPassword = customerPassword;
    this.isSessionAlive = isSessionAlive;
}
public String getCustomerNumber() {
    return customerNumber;
}
public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
}
public String getCustomerPassword() {
    return customerPassword;
}
public void setCustomerPassword(String customerPassword) {
    this.customerPassword = customerPassword;
}
public boolean getIsSessionAlive() {
    return isSessionAlive;
}
public boolean setIsSessionAlive(boolean isSessionAlive) {
    return this.isSessionAlive = isSessionAlive;
}

}
