package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {
    private final Address toAddress;
    private final Address fromAddress;


    public DeliveryManager(String fromAddress, String toAddress) {
        this.toAddress = new Address(toAddress);
        this.fromAddress = new Address(fromAddress);
    }

    public DeliverCenter allocate(){
        if (toAddress.getProvince().equals(fromAddress.getProvince()) && toAddress.getCity().equals(toAddress.getCity())){
            return DeliverCenter.LOCAL;
        }
        if (toAddress.getProvince().equals(fromAddress.getProvince())) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }
}
