package com.BankingAPI.BankApi.Service;

import com.BankingAPI.BankApi.DAO.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl {

    @Autowired

    private TransactionsRepository transactionsRepository;
}
