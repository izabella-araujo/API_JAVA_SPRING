package com.bank.santander_code_girls.utils;

import java.time.Year;

public class AccountUtils {

    public static final String ACCOUNT_EXISTS_CODE="001";
    public static final String ACCOUNT_EXISTS_MESSAGE="Este usuario ja possui uma conta";
    public static final String ACCOUNT_CREATION_SUCCESS="002";
    public static final String ACCOUNT_CREATION_MESSAGE="Conta criada com sucesso";

    public static String generateAccountNumber(){
    Year currentYear = Year.now();

    int min = 100000;
    int max = 999999;

    int randNumber = (int)Math.floor(Math.random() * (max - min + 1) + min);

    String year = String.valueOf(currentYear);
    String randomNumber = String.valueOf(randNumber);
    StringBuilder accountNumber = new StringBuilder();

    return accountNumber.append(year).append(randomNumber).toString();

    }
}
