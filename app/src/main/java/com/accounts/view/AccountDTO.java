package com.accounts.view;

import java.math.BigDecimal;
import java.util.List;

import com.accounts.app.model.Card;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccountDTO {
private String accountNumber;
private String productNumber;
private String productName;
private BigDecimal balance;
private List<Card> cards;
}
