package com.cards.app.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cards.app.model.Card;
import com.cards.app.repository.CardsRepository;
import com.cards.app.service.CardsService;
@Service
public class CardsServiceImp implements CardsService{

    @Autowired
    private CardsRepository cardsRepository;
    @Override
    public List<Card> getCardsByAccountNumber(String accountNumber) {
        return cardsRepository.findByAccountNumber(accountNumber);
    }

    
}
