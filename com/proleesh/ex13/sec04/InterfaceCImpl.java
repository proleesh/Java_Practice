package com.proleesh.ex13.sec04;

public class InterfaceCImpl implements InterfaceC{

    @Override
    public void methodA() {
        System.out.println("InterfaceC - methodA 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceC - methodB 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceC - methodC 실행");
    }
}
