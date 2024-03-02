package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long AccountNumber;

    @Column(name = "CustomerID", nullable = false)
    private Customer customerId; //foreign key for customers table (one customer one account)

    @Column(name = "AccountType", nullable = false)
    private String accountType;

    @Column(name = "Balance", nullable = false)
    private String balance;

    @Column(name = "DateOpened")
    private String dateOpened;
}
