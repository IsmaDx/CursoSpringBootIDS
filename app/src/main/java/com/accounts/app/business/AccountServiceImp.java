package com.accounts.app.business;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accounts.app.Service.AccountService;
import com.accounts.app.model.Account;
import com.accounts.app.repository.AccountRepository;
@Service
public class AccountServiceImp implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    private final static String STATU_STRING = "ACT";
    @Override
    public List<Account> getAccounts() {
            List<Account> accounts=  accountRepository.findAll();
            return accounts.stream().filter(account -> account.getAccountStatus().equals(STATU_STRING))
            .collect(Collectors.toList());
        }



	@Override
	public Account getCustomerNumber(String accountId) {
		return accountRepository.findByCustomerNumber(accountId);
	}

}
