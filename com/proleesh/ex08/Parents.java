package com.proleesh.ex08;

public class Parents {
    String name;
    int age;

    public Parents(){
        System.out.println("부모의 기본 생성자 호출 성공!");
    }

    public Parents(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("1. 부모의 생성자 호출 성공!");
    }
}
