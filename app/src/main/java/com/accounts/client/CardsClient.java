package com.accounts.client;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.accounts.app.model.Card;
@FeignClient(name="cards-client",url="localhost:8081")
public interface CardsClient {
   @GetMapping("/api/cards/{accountNumber}")
   List<Card> getCardsByAccountNumber(@PathVariable("accountNumber")String accountNumber);

}
