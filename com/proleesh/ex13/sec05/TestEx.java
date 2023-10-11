package com.proleesh.ex13.sec05;

public class TestEx {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        b.greeting();
        c.greeting();
        d.greeting();
        e.greeting();

        System.out.println();
        A a;
        a = b;
        a.greeting();
        a = c;
        a.greeting();
        a = d;
        a.greeting();
        a = e;
        a.greeting();
    }
}
