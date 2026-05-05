package com.example.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.AccountRepository;
import com.example.bankapp.entity.Account;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repo;

    public Account save(Account acc) {
        return repo.save(acc);
    }

    public List<Account> getAll(Sort sort) {
        return repo.findAll(sort);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Account getById(Long id) {
        return repo.findById(id).orElse(null);
    }
}