package com.BankingAPI.BankApi.Service.Impl;


import com.BankingAPI.BankApi.Model.Loan;

import java.util.List;

public interface ILoanService {

    Loan saveLoan(Loan loan);
    List<Loan> getAllLoans();
    Loan getLoanByID(long id);
    Loan updateLoan(Loan loan, long id);
    void deleteLoan(long id);
}
