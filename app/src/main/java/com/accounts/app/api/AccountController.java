package com.accounts.app.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accounts.app.Service.AccountService;
import com.accounts.app.model.Account;
import com.accounts.view.AccountDTO;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class AccountController {

    @Autowired
    private AccountService accountService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    
  @GetMapping("/accounts/{customerNumber}")
  public List<AccountDTO> accountsRetrive(@RequestHeader("Authorization") String auth,
  @PathVariable("customerNumber")String customerNumber)
  {
    System.out.println("Authorization: " + auth);
    System.out.println(redisTemplate.opsForValue().get(customerNumber));
    return accountService.getCustomerNumber(customerNumber);
  }
    
}
