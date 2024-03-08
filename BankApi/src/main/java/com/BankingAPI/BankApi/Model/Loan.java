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

    public Loan() {
    }

    public Loan(Long id, String loanNumber, Double loanAmount, Double interestRate, Date dateIssued, Date dateDue, Customer customer, List<Payment> payments) {
        this.id = id;
        this.loanNumber = loanNumber;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.dateIssued = dateIssued;
        this.dateDue = dateDue;
        this.customer = customer;
        this.payments = payments;
    }

    public Long getId() {
        return id;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public void setDateDue(Date dateDue) {
        this.dateDue = dateDue;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
