package com.BankingAPI.BankApi.Service;

import com.BankingAPI.BankApi.DAO.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired

    private PaymentRepository paymentRepository;
}
