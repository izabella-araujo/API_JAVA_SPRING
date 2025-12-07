package com.bank.santander_code_girls.services.impl;

import com.bank.santander_code_girls.dto.BankResponse;
import com.bank.santander_code_girls.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
