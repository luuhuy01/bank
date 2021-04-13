package com.sqa.bank.service;

import com.sqa.bank.entity.Account;
import com.sqa.bank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepo;

    public List<Account> findAll() {
        return accountRepo.findAll();
    }

    public Account save(Account account){

        return accountRepo.save(account);
    }
}
