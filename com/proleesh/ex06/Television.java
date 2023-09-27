package com.proleesh.ex06;

public class Television {
    static String company = "Proleesh Tech";
    static String product = "WEB Fast";
    static String info;

    int num;

    static{
//        this.num = 1; 인스턴스 멤버를 사용할 수 없음
        System.out.println("1");
        info = company + "사의 " + product;
        info += "제품 입니다.";
    }
    static{
        System.out.println("2");
        System.out.println("static 정적 필드 정상적으로 출력.");
    }
}
