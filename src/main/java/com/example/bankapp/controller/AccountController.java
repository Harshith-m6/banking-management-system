package com.example.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.bankapp.service.AccountService;
import com.example.bankapp.entity.Account;

@Controller
@RequestMapping("/dashboard")
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping
    public String dashboard() {
        return "dashboard";
    }

    @GetMapping("/create")
    public String createForm(Model model) {
        model.addAttribute("account", new Account());
        return "create-account";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Account acc) {
        service.save(acc);
        return "redirect:/dashboard/view";
    }

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("accounts", service.getAll(Sort.by("accountNumber")));
        return "view-accounts";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/dashboard/view";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("account", service.getById(id));
        return "create-account";
    }
}