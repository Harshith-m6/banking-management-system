package com.example.bankapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.UserRepository;
import com.example.bankapp.entity.User;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User login(String username, String password) {
        List<User> users = repo.findByUsernameAndPassword(username, password);
        return users.isEmpty() ? null : users.get(0);
    }
}