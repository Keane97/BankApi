package com.BankingAPI.BankApi.Service.Impl;



import com.BankingAPI.BankApi.Model.Payment;

import java.util.List;

public interface IPaymentService {

    Payment savePayment(Payment payment);
    List<Payment> getAllPayments();
    Payment getPaymentByID(long id);
    Payment updatePayment(Payment payment, long id);
    void deletePayment(long id);
}
