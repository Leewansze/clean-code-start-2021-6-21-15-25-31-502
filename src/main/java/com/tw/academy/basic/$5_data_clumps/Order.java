package com.tw.academy.basic.$5_data_clumps;

public class Order {

    private int orderNumber;

    private final User buyer;

    public Order(int orderNumber, User user) {
        this.orderNumber = orderNumber;
        this.buyer = user;
    }

    public String confirm(){
        return String.format("Please confirm buyer information: buyer name is %s, " +
                "buyer phone number is %s and buyer address is %s.", buyer.getName(), buyer.getPhoneNumber(), buyer.getAddress());
    }
}

