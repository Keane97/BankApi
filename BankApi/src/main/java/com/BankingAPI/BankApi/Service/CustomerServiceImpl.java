package com.BankingAPI.BankApi.Service;

import com.BankingAPI.BankApi.DAO.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl {

    @Autowired

    private CustomerRepository customerRepository;
}
