package com.BankingAPI.BankApi.Service;

import com.BankingAPI.BankApi.DAO.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl {

    @Autowired

    private LoanRepository loanRepository;
}
