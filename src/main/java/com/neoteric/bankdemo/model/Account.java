package com.neoteric.bankdemo.model;

public class Account {


    public  String Number;

    public String IFSC;

    public String BranchName;

    public int balence;

    @Override
    public String toString() {
        return "Account{" +
                "Number='" + Number + '\'' +
                ", IFSC='" + IFSC + '\'' +
                ", BranchName='" + BranchName + '\'' +
                ", balence=" + balence +
                '}';
    }
}
