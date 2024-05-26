package com.proleesh.ex34.staticinit;

public class StaticInitTest {
    // def class variable
    static int count = 2;
    static{
        System.out.println("StaticInitTest static block");
        name = "Java 프로그래밍";
    }
    static String name = "Java Master";

    public static void main(String[] args) {
        System.out.println("count 클래스 var: " + StaticInitTest.count);
        System.out.println("name 클래스 var: " + StaticInitTest.name);
    }
}
