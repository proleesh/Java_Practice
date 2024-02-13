package com.proleesh.ex31.test09;

public class TestMain {
    public static void main(String[] args) {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = (ConcretePrototype1)p1.Clone();
        System.out.println("Cloned: " + c1.getId());
        ConcretePrototype1 c2 = (ConcretePrototype1)c1.Clone();
        System.out.println("Cloned: " + c2.getId());
    }
}
