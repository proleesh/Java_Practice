package com.proleesh.ex13.sec07;

public class A {
    class B{
        void methodB(){
            System.out.println("methodB() 실행");
        }
    }

    B field = new B();

    A(){
        B b = new B();
    }

    void method(){
        B b = new B();
    }
}
