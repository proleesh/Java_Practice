package com.proleesh.ex02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean k1 = new Korean("홍길동", "990101-1000001");
        Korean k2 = new Korean("이몽룡", "990102-1000002");
        Korean k3 = new Korean("이순신", "990103-1000003");

        k1.age = 19;
        System.out.println("정보: 이름: " +
                k1.name + ", 주민 번호: " + k1.ssn + "," +
                " 국적: " + k1.nation + ", 나이: " + k1.age);
        k2.age = 29;
        System.out.println("정보: 이름: " + k2.name + ", " +
                "주민 번호: " + k2.ssn + ", " +
                "국적: " + k2.nation + ", 나이: " + k2.age);
        k3.age = 49;
        System.out.println("정보: 이름: " + k3.name +
                ", 주민 번호: " + k3.ssn + ", 국적: "
                + k3.nation + ", 나이: " + k3.age);

        Korean k4 = new Korean(20);
        System.out.println("이름: " + k4.name);

        Korean k5 = new Korean(18);
        k5.name = "김수로";
        k5.ssn = "990104-1000004";
        System.out.println("정보: 이름: " + k5.name +
                ", 주민 번호: " + k5.ssn + ", 국적: " +
                k5.nation + ", 나이: " + k5.age);

    }
}
