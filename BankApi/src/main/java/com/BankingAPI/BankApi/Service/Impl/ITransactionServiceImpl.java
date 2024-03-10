package com.BankingAPI.BankApi.Service.Impl;

import com.BankingAPI.BankApi.Model.Transaction;

import java.util.List;

public interface ITransactionServiceImpl {

    Transaction saveTransaction(Transaction transaction);
    List<Transaction> getAllTransactions();
    Transaction getTransactionByID(long id);
    Transaction updateTransaction(Transaction transaction, long id);
    void deleteTransaction(long id);
}
