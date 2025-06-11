package com.accounts.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accounts.app.model.Account;
import com.accounts.app.model.AccountId;

public interface AccountRepository extends JpaRepository<Account,AccountId>{

    List<Account> findByCustomerNumber(String customerNumber);
}
