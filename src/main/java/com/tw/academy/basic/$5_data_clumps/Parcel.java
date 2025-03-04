package com.tw.academy.basic.$5_data_clumps;

public class Parcel {

    private String size;
    private Double weight;

    private final User receiver;
    private final User sender;

    public Parcel(String size, Double weight,
                  User receiver, User sender) {
        this.receiver = receiver;
        this.size = size;
        this.weight = weight;
        this.sender = sender;
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                receiver.getName(), receiver.getPhoneNumber(), receiver.getAddress());
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                this.sender.getName(), this.sender.getPhoneNumber(), this.sender.getAddress());
    }
}
