package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class Address {
    private String province;
    private String city;

    public Address(String address) {
        this.province = address.substring(0, address.indexOf("省"));
        this.city = address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }
}
