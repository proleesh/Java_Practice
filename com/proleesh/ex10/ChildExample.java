package com.proleesh.ex10;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;

        parent.method1();
        parent.method2();

        child.method1();
        child.method2();
        child.method3();
    }
}
