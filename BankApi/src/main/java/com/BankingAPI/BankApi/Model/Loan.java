package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loanNumber;

    @Column(name = "LoanAmount")
    private Double loanAmount;

    @Column(name = "InterestRate")
    private Double interestRate;

    @Column(name = "DateIssued")
    private Date dateIssued;

    @Column(name = "DateDue")
    private Date dateDue;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL)
    private List<Payment> payments = new ArrayList<>();
}
