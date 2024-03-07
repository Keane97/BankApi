package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Amount")
    private BigDecimal amount;

    @Column(name = "PaymentDate", nullable = false)
    private String paymentDate;

    @ManyToOne
    @JoinColumn(name = "loan_id")
    private Loan loan;
}
