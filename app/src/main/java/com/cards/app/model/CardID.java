package com.cards.app.model;
import java.io.Serializable;

import lombok.Data;
@Data
public class CardID implements Serializable{
private String accountNumber;
private String cardNumber;
}
