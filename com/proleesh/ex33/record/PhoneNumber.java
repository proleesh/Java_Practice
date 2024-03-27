package com.proleesh.ex33.record;

public record PhoneNumber (String number){
    public String returnNum(){
        return String.format("전화번호: %s", number);
    }
}
