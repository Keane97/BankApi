package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long LoanId;

    @OneToOne(mappedBy = "loanID")
    private Customer customerId; //foreign key for customers table (one customer many loans)

    @Column(name = "LoanAmount")
    private Double loanAmount;

    @Column(name = "InterestRate")
    private Double interestRate;

    @Column(name = "DateIssued")
    private Account dateIssued;

    @Column(name = "DateDue")
    private Account dateDue;

    @OneToMany(mappedBy = "loanId")
    private List<Payments> PaymentId;
}
