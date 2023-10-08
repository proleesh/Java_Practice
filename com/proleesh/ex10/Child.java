package com.proleesh.ex10;

public class Child extends Parent{
    @Override
    public void method1() {
//        super.method1();
        System.out.println("Child-method1()");
    }

    @Override
    public void method2() {
//        super.method2();
        System.out.println("Child-method2()");
    }
    public void method3(){
        System.out.println("Child-method3()");
    }
}
