package com.banking.accountservice.service;

import com.banking.accountservice.dto.CreateAccountRequest;
import com.banking.accountservice.repository.AccountRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService createAccount(@Valid CreateAccountRequest request) {
        // Logic to create an account
        log.info("Creating account for: {}", request.getEmail());

        if(accountRepository.existsByEmail(request.getEmail())) {;
            throw new IllegalArgumentException("Account with email already exists for email: " + request.getEmail());
        }
    }













}
