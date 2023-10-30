package com.proleesh.ex21.sec01;

public class MethodRefereceExample {
    public static void main(String[] args) {
        Person person = new Person();
        // 정적 메소드일 경우
        // 메소드 참조
        person.action(Computer :: staticMethod); // class :: staticM

        // 인스턴스 메소드일 경우
        Computer com = new Computer();
        person.action(com::instanceMethod); // instance :: method
    }
}
