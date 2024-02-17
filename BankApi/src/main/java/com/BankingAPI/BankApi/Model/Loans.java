package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

@Entity
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long LoanId;

    @Column(name = "CustomerId", nullable = false)
    private Customer customerId;

    @Column(name = "LoanAmount")
    private Double loanAmount;

    @Column(name = "InterestRate")
    private Double interestRate;

    @Column(name = "DateIssued")
    private Account dateIssued;

    @Column(name = "DateDue")
    private Account dateDue;
}
