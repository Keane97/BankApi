package com.BankingAPI.BankApi.Service;

import com.BankingAPI.BankApi.DAO.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired

    private AccountRepository accountRepository;
}
