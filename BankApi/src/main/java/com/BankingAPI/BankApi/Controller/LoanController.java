package com.BankingAPI.BankApi.Controller;

import com.BankingAPI.BankApi.Service.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loans")
public class LoanController {
    @Autowired
    private LoanServiceImpl loanServiceImpl;
}
