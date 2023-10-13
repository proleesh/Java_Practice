package com.proleesh.ex15.sec01;

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = String.class;
        System.out.println(clazz);
        Class clazz2 = Class.forName("java.lang.String");
        System.out.println(clazz2);
        String str = "Hello";
        Class clazz3 = str.getClass();
        System.out.println(clazz3);

    }
}
