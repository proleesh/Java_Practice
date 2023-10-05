package com.proleesh.ex08;

public class Children extends Parents{
    String hobby;

    public Children(String name, int age, String hobby) {
        super(name, age); // 부모의 filed 그대로 사용
        this.hobby = hobby;
        System.out.println("2. 자녀의 생성자 호출 성공!");
    }
}
