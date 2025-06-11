package com.accounts.app.Service;

import java.util.List;

import com.accounts.app.model.Account;
import com.accounts.view.AccountDTO;

public interface AccountService {
List<AccountDTO> getCustomerNumber(String accountId);

}
