package com.example.accountservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/internal/accounts")
public class AccountController {

    @GetMapping
    public String getAccounts() {
        System.out.println("Account Service Received: /internal/accounts");
        return "Account Service: All Accounts";
    }

    @GetMapping("/{id}")
    public String getAccount(@PathVariable String id) {
        System.out.println("Account Service Received: /internal/accounts/" + id);
        return "Account Details for ID: " + id;
    }
}