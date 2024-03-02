package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long TransactionId;

    @Column(name = "AccountNumber", nullable = false)
    private Account accountNumber; //foreign key for account table (one account many transactions)

    @Column(name = "TransactionType")
    private String transactionType;

    @Column(name = "Amount")
    private Double amount;

    @Column(name = "TransactionDate")
    private Date transactionDate;

}
