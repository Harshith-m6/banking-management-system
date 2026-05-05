package com.example.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.bankapp.service.UserService;
import com.example.bankapp.entity.User;

@Controller
public class LoginController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {

        User user = service.login(username, password);

        if (user != null) {
            return "redirect:/dashboard";
        } else {
            model.addAttribute("error", "Invalid Credentials");
            return "login";
        }
    }
}