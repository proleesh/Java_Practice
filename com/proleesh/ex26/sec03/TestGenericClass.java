package com.proleesh.ex26.sec03;

class MyGeneric<T>{
    T instance;

    public MyGeneric(T instance) {
        this.instance = instance;
    }

    public T getInstance() {
        return instance;
    }
}
public class TestGenericClass {
    public static void main(String[] args) {
        MyGeneric<String> g = new MyGeneric<>("SK");
        System.out.println(g.getInstance());

        MyGeneric<Integer> g2 = new MyGeneric<>(1);
        System.out.println(g2.getInstance());
    }
}
