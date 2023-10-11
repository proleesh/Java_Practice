package com.proleesh.ex13.sec03;

public class TestEx {
    public static void main(String[] args) {
        Human h1 = new Human("홍길동");
        System.out.println("사용자 이름: " + h1.getName());
        h1.browserChoose("Chrome");
        h1.v8("https://www.youtube.com");

        Human h2 = new Human("이순신");
        System.out.println("사용자 이름: " + h2.getName());
        h2.browserChoose("MS Edge");
        h2.v8("https://www.naver.com");

    }
}
