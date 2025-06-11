package com.cards.app.service;

import java.util.List;

import com.cards.app.model.Card;

public interface CardsService {
List<Card> getCardsByAccountNumber(String accountNumber);
}
 