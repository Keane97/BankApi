package com.BankingAPI.BankApi.Model;

import jakarta.persistence.*;

@Entity
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PaymentId;

    @ManyToOne
    @JoinColumn(name = "loanId")
    private Loans loanId; //foreign key for loans (one loan many payments)

    @Column(name = "Amount")
    private String amount;

    @Column(name = "PaymentDate", nullable = false)
    private String paymentDate;
}
