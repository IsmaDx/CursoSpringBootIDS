package com.cards.app.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cards.app.model.Card;
import com.cards.app.service.CardsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class CardsController {
@Autowired
private CardsService cardsService;
@GetMapping("/cards/{accountNumber}")
public List<Card> getCardsByAccountNumber(@PathVariable("accountNumber") String accountNumber) {
    return cardsService.getCardsByAccountNumber(accountNumber);
}


}
