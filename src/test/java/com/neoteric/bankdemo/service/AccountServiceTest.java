package com.neoteric.bankdemo.service;

import com.neoteric.bankdemo.model.Account;
import com.neoteric.bankdemo.model.Addresss;
import com.neoteric.bankdemo.model.BankForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTest {

    @Test
    public void getAccountAgeGreaterThaneighteen() {


        BankForm customer1 = new BankForm();

        customer1.FirstName = "sanjay";
        customer1.LastName = "konda";
        customer1.age = 21;
        customer1.ContactNumber = 99922228882l;
        customer1.Date = 22-02-2022;


        Addresss addresss = new Addresss();

        addresss.StreetName = "manasa nagar";
        addresss.Area = "busstand backside";
        addresss.City = "suryapet";
        addresss.District = "suryapet";
        addresss.PinCode = 232222;

        AccountService accountService = new AccountService();


        Account account = accountService.getAccount(customer1);

        System.out.println(customer1);
        System.out.println(account);

        Assertions.assertEquals(21, customer1.age);
        Assertions.assertNotNull(account);

    }
    @Test

    public void getAccountAgelessThaneighteen() {


        BankForm customer11 = new BankForm();

        customer11.FirstName = "sanjay";
        customer11.LastName = "konda";
        customer11.age = 16;
        customer11.ContactNumber = 99922228882l;
        customer11.Date = 22-02-2022;


        Addresss addresss1 = new Addresss();

        addresss1.StreetName = "manasa nagar";
        addresss1.Area = "busstand backside";
        addresss1.City = "suryapet";
        addresss1.District = "suryapet";
        addresss1.PinCode = 232222;

        AccountService accountService1 = new AccountService();


        Account account = accountService1.getAccount(customer11);

        System.out.println(customer11);
        System.out.println(account);

        Assertions.assertEquals(16, customer11.age);
        Assertions.assertNull(account);

    }

}
