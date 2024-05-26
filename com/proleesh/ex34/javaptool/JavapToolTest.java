package com.proleesh.ex34.javaptool;

public class JavapToolTest {
    // definition count about instance variable and initialization
    int count = 20;
    {
        count = 12;
    }
    // def double constructor
    public JavapToolTest(){
        System.out.println(count);
    }
    public JavapToolTest(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        JavapToolTest test = new JavapToolTest();
        JavapToolTest test2 = new JavapToolTest("Kimi");

    }

}
