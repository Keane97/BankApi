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

    public Payment() {
    }

    public Payment(Long id, BigDecimal amount, String paymentDate, Loan loan) {
        this.id = id;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.loan = loan;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public Loan getLoan() {
        return loan;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }
}
