package com.bank.santander_code_girls.services.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.santander_code_girls.dto.AccountInfo;
import com.bank.santander_code_girls.dto.BankResponse;
import com.bank.santander_code_girls.dto.UserRequest;
import com.bank.santander_code_girls.entity.User;
import com.bank.santander_code_girls.repository.UserRepository;
import com.bank.santander_code_girls.utils.AccountUtils;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public BankResponse createAccount(UserRequest userRequest){
        /*Ao criar uma conta salva umnovo usuario no banco dedados | checar se usuario existe */
        if (userRepository.existsByEmail(userRequest.getEmail())){
            return BankResponse.builder()
                .responseCode(AccountUtils.ACCOUNT_EXISTS_CODE)
                .responseMessage(AccountUtils.ACCOUNT_EXISTS_MESSAGE)
                .accountInfo(null)
                .build();
        }
        User newUser = User.builder()
            .firstName(userRequest.getFirstName())
            .lastName(userRequest.getLastName())
            .otherName(userRequest.getOtherName())
            .gender(userRequest.getGender())
            .address(userRequest.getAddress())
            .stateOfOrigin(userRequest.getStateOfOrigin())
            .acconuntNumber(AccountUtils.generateAccountNumber())
            .accountBalance(BigDecimal.ZERO)
            .email(userRequest.getEmail())
            .phoneNumber(userRequest.getPhoneNumber())
            .alternativePhoneNumber(userRequest.getAlternativePhoneNumber())
            .status("ACTIVE")
            .build();




        User savedUser = userRepository.save(newUser);
        return BankResponse.builder()
            .responseCode(AccountUtils.ACCOUNT_CREATION_SUCCESS)
            .responseMessage(AccountUtils.ACCOUNT_CREATION_MESSAGE)
            .accountInfo(AccountInfo.builder()
                .accountBalance(savedUser.getAccountBalance())
                .accountNumber(savedUser.getAcconuntNumber())
                .accountName(savedUser.getFirstName() + " " + savedUser.getLastName() + " " + savedUser.getOtherName())
                .build())
            .build();
    }
    
}
