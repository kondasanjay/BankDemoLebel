package com.neoteric.bankdemo.service;

import com.neoteric.bankdemo.model.Account;
import com.neoteric.bankdemo.model.BankForm;

import java.util.UUID;

public class AccountService {

    public Account getAccount(BankForm customer1){

        Account account=null;

        if(customer1.age>18){


             account=new Account();


            account.Number= UUID.randomUUID().toString();
            account.BranchName="suryapet";

            account.IFSC="SBIIFSC";


        }

        return account;
    }

}
