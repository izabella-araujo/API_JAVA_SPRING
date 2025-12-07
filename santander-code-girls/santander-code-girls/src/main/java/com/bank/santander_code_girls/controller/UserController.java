package com.bank.santander_code_girls.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.santander_code_girls.dto.BankResponse;
import com.bank.santander_code_girls.dto.UserRequest;
import com.bank.santander_code_girls.services.impl.UserService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount(userRequest);
    }
    
}
