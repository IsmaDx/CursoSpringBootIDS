package com.accounts.app.Service;

import java.util.List;

import com.accounts.app.model.Account;

public interface AccountService {
List<Account> getAccounts();
Account getCustomerNumber(String accountId);
}
