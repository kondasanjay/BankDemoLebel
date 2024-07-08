package com.neoteric.bankdemo.model;

public class BankForm {

    public String FirstName;

    public String  LastName;

    public int  age;

    public String   Address;
    public long AccountNumber;
    public long ContactNumber;
    public int Date;

    public Addresss addresss;

    @Override
    public String toString() {
        return "BankForm{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                ", AccountNumber=" + AccountNumber +
                ", ContactNumber=" + ContactNumber +
                ", Date=" + Date +
                ", addresss=" + addresss +
                '}';
    }
}
