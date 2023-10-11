package com.proleesh.ex13.sec04;

public class TestEx {
    public static void main(String[] args) {
        InterfaceA i1 = new InterfaceCImpl();
        i1.methodA();
        System.out.println();
        InterfaceB i2 = new InterfaceCImpl();
        i2.methodB();
        System.out.println();
        InterfaceC i3 = new InterfaceCImpl();
        i3.methodA();
        i3.methodB();
        i3.methodC();
    }
}
