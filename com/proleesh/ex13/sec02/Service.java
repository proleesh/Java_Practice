package com.proleesh.ex13.sec02;

public interface Service {
    default void defaultMethod1(){
        System.out.println("defualtMethod1() 종속 코드");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("defualtMethod2() 종속 코드");
        defaultCommon();
    }

    // private 메서드
    private void defaultCommon(){
        System.out.println("defaultMethod 중복 코드A");
        System.out.println("defaultMethod 중복 코드B");
    }

    static void staticMethod1(){
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2(){
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    // private static 메서드
    private static void staticCommon() {
        System.out.println("staticMethod 중복 코드C");
        System.out.println("staticMethod 중복 코드D");
    }


}
