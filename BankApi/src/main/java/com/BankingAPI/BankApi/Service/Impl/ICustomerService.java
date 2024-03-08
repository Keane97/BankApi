package com.BankingAPI.BankApi.Service.Impl;


import com.BankingAPI.BankApi.Model.Customer;

import java.util.List;

public interface ICustomerService {
    Customer saveCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomerByID(long id);
    Customer updateCustomer(Customer customer, long id);
    void deleteCustomer(long id);
}
