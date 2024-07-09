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

        customer1.balence=5001;


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
        System.out.println(account.balence);


        Assertions.assertEquals(5001, customer1.balence);
        Assertions.assertNotNull(account);

    }
    @Test

    public void getAccountAgelessThaneighteen() {


        BankForm customer1 = new BankForm();

        customer1.FirstName = "naveen";
        customer1.LastName = "eeerr";
        customer1.age = 16;
        customer1.ContactNumber = 99922228882l;
        customer1.Date = 22-02-2022;
        customer1.balence=4000;


        Addresss addresss = new Addresss();

        addresss.StreetName = "manasa nagar";
        addresss.Area = "busstand backside";
        addresss.City = "suryapet";
        addresss.District = "suryapet";
        addresss.PinCode = 232222;

        AccountService accountService1 = new AccountService();


        Account account = accountService1.getAccount(customer1);

        System.out.println(customer1);
        System.out.println(account);
       System.out.println(account.balence);

        Assertions.assertEquals(4000, customer1.balence);
        Assertions.assertNull(account);

    }

}
