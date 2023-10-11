package com.proleesh.ex13.sec08;

public class A {
    // 인스턴스 멤버 클래스
    class B{
        // 인스턴스 필드
        int field1 = 1;

        // 정적 필드(Java 17부터 허용)
        static int field2 = 2;
        // 생성자
        B(){
            System.out.println("B-생성자 실행");
        }
        void method1(){
            System.out.println("B-method1 실행");
        }
        static void method2(){
            System.out.println("B-method2 실행");
        }
    }
    void useB(){
        B b = new B();
        System.out.println(b.field1);
        b.method1();
        System.out.println(B.field2);
        B.method2();
    }

}
