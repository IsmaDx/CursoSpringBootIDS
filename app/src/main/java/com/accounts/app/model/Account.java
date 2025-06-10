package com.accounts.app.model;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name ="ACCOUNTS")
@IdClass(AccountId.class)
public class Account {
@Id
private String customerNumber;
@Id
private String accountNumber;
private String productName;
private String accountStatus;
private BigDecimal balance;
private String creationDate;
private String productNumber;
 
}
