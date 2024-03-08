package com.BankingAPI.BankApi.Service;

import com.BankingAPI.BankApi.DAO.AccountRepository;
import com.BankingAPI.BankApi.DAO.TransactionsRepository;
import com.BankingAPI.BankApi.Model.Account;
import com.BankingAPI.BankApi.Service.Impl.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionsRepository transactionsRepository;

    @Override
    public Account saveAccount(Account account) {
        return null;
    }

    @Override
    public List<Account> getAllAccount() {
        return null;
    }

    @Override
    public Account getAccountByID(long id) {
        return null;
    }

    @Override
    public Account updateAccount(Account employee, long id) {
        return null;
    }

    @Override
    public void deleteAccount(long id) {

    }
}
