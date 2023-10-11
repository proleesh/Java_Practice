package com.proleesh.ex13.sec09;


public class A {
    static class B{
        void methodB(){
            System.out.println("methodB() 실행");
        }
    }

    B field1 = new B();

    static B field2 = new B();

    A(){
        B b = new B();
    }
    void method(){
        B b = new B();
    }
    static void method2(){
        B b = new B();

    }

}
