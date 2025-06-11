package com.accounts.app.business;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.app.Service.AccountService;
import com.accounts.app.model.Account;
import com.accounts.app.repository.AccountRepository;
import com.accounts.client.CardsClient;
import com.accounts.view.AccountDTO;
@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired 
    private CardsClient cardsClient;

    private Function<Account,AccountDTO> accountMapper = account ->
     new AccountDTO(account.getAccountNumber(), account.getProductNumber(), account.getProductName(), account.getBalance(),cardsClient.getCardsByAccountNumber(account.getAccountNumber()));
    private final static String STATUS_STRING = "ACT";
    @Override
    public List<AccountDTO> getCustomerNumber(String accountId) {
            //List<Account> accounts=  accountRepository.findAll();
            List<Account> accounts = accountRepository.findByCustomerNumber(accountId);
            
            return accounts.stream().filter(account -> account.getAccountStatus().equals(STATUS_STRING)).map(accountMapper)
            .collect(Collectors.toList());
        }
}
