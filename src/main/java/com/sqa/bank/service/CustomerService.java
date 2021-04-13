package com.sqa.bank.service;

import com.sqa.bank.entity.Account;
import com.sqa.bank.entity.Customer;
import com.sqa.bank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> findAll(){
        return customerRepo.findAll();
    }

    public Customer save(Customer customer){
        return customerRepo.save(customer);
    }
}
