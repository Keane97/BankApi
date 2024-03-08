package com.BankingAPI.BankApi.Service.Impl;

import com.BankingAPI.BankApi.Model.Account;

import java.util.List;

public interface IAccountService {
    Account saveAccount(Account account);
    List<Account> getAllAccount();
    Account getAccountByID(long id);
    Account updateAccount(Account employee, long id);
    void deleteAccount(long id);
}
