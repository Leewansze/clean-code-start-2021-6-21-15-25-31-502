package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private String size;
    private Double weight;

    private String receiverName;
    private String receiverPhoneNumber;
    private String receiverAddress;

    private String senderName;
    private String senderPhoneNumber;
    private String senderAddress;

    public Parcel(String size, Double weight,
                  User received, User sender) {
        this.size = size;
        this.weight = weight;
        this.receiverName = received.getName();
        this.receiverPhoneNumber = received.getPhoneNumber();
        this.receiverAddress = received.getAddress();
        this.senderName = sender.getName();
        this.senderPhoneNumber = sender.getPhoneNumber();
        this.senderAddress = sender.getAddress();
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                receiverName, receiverPhoneNumber, receiverAddress);
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                senderName, senderPhoneNumber, senderAddress);
    }
}
