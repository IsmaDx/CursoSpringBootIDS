package com.cards.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="CARDS")
@IdClass(CardID.class)
public class Card {
@Id
private String accountNumber;
@Id
private String cardNumber;
private String cardType;
private String cardStatus;
private String creationDate;

}
