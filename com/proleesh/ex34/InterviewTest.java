package com.proleesh.ex34;

public class InterviewTest {
    public static void main(String[] args) {
        f();
    }
    public static void f(){
//        String[] a = new String[2];
//        Object[] b = a;
        Object[] a = new Object[2];
//        a[0] = "hi";
//        b[1] = Integer.valueOf(42); // ArrayStoreException
        a[0] = "hi";
        a[1] = 42;
        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
