package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

@Entity
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PaymentId;

    @Column(name = "LoanId", nullable = false)
    private Loans loanId;

    @Column(name = "Amount")
    private String amount;

    @Column(name = "PaymentDate", nullable = false)
    private String paymentDate;
}
