package com.proleesh.ex02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("홍길동", "990101-1000001");
        Korean k2 = new Korean("이몽룡", "990102-1000002");
        Korean k3 = new Korean("이순신", "990103-1000003");

        System.out.println("정보: 이름: " + k1.name + ", 주민 번호: " + k1.ssn + ", 국적: " + k1.nation);
        System.out.println("정보: 이름: " + k2.name + ", 주민 번호: " + k2.ssn + ", 국적: " + k2.nation);
        System.out.println("정보: 이름: " + k3.name + ", 주민 번호: " + k3.ssn + ", 국적: " + k3.nation);

    }
}
