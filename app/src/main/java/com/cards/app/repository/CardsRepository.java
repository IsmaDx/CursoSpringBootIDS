package com.cards.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cards.app.model.Card;
import com.cards.app.model.CardID;

import java.util.List;


public interface CardsRepository extends JpaRepository<Card,CardID>{
    List<Card> findByAccountNumber(String accountNumber);
}
