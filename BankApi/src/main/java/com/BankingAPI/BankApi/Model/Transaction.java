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

    public Transaction() {
    }

    public Transaction(Long id, String description, String transactionType, Double amount, Date transactionDate, Account account) {
        this.id = id;
        this.description = description;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public Account getAccount() {
        return account;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
