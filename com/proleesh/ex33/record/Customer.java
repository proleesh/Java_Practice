package com.proleesh.ex33.record;

public record Customer(Integer id, String name, String phoneNumber, String address) {
    public String info(){
        return String.format("id: %d, name: %s, phone-number: %s, Address: %s", id, name, phoneNumber, address);
    }
}
