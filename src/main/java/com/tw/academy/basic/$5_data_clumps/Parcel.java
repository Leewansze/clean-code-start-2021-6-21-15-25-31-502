package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private String size;
    private Double weight;

    private String senderName;
    private String senderPhoneNumber;
    private String senderAddress;
    private User received;

    public Parcel(String size, Double weight,
                  User received, User sender) {
        this.received = received;
        this.size = size;
        this.weight = weight;
        this.senderName = sender.getName();
        this.senderPhoneNumber = sender.getPhoneNumber();
        this.senderAddress = sender.getAddress();
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                received.getName(), received.getPhoneNumber(), received.getAddress());
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                senderName, senderPhoneNumber, senderAddress);
    }
}
