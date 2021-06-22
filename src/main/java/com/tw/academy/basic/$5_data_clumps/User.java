package com.tw.academy.basic.$5_data_clumps;

public class User {
    private final String name;
    private final String phoneNumber;
    private final String address;

    public User(String buyerName, String buyerPhoneNumber, String buyerAddress) {
        this.name = buyerName;
        this.phoneNumber = buyerPhoneNumber;
        this.address = buyerAddress;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
