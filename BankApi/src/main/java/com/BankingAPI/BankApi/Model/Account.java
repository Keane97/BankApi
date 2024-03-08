package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

    @Column(name = "Balance", nullable = false)
    private String balance;

    @Column(name = "DateOpened")
    private String dateOpened;

    public Account() {
    }

    public Account(Long id, String accountNumber, Customer customer, List<Transaction> transactions, String balance, String dateOpened) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.transactions = transactions;
        this.balance = balance;
        this.dateOpened = dateOpened;
    }

    public Long getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public String getBalance() {
        return balance;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }


}
