package com.neoteric.bankdemo.model;

public class Addresss {

    public String StreetName;

    public String Area;

    public String City;

    public String District;

    public int PinCode;

    @Override
    public String toString() {
        return "Addresss{" +
                "StreetName='" + StreetName + '\'' +
                ", Area='" + Area + '\'' +
                ", City='" + City + '\'' +
                ", District='" + District + '\'' +
                ", PinCode=" + PinCode +
                '}';
    }
}
