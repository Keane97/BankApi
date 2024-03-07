package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Description")
    private String description;

    @Column(name = "TransactionType")
    private String transactionType;

    @Column(name = "Amount")
    private Double amount;

    @Column(name = "TransactionDate")
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
