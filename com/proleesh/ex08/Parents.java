package com.proleesh.ex08;

import java.sql.SQLOutput;

public class Parents {
    String name;
    int age;

    public Parents(){}

    public Parents(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("1. 부모의 생성자 호출 성공!");
    }
}
