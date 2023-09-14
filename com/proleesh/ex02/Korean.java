package com.proleesh.ex02;

/**
 * 오버로딩을 하는 이유는 매개값으로 객체의 필드를 다양하게 초기화하기 위해서다.
 */
public class Korean {
    String nation = "Korea";
    String name;
    String ssn;

    int age;

    public Korean(){
        System.out.println("default constructor 호출 성공!!");
    }

    public Korean(int age){
        this.age = age;
    }
    public Korean(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
    }
}
