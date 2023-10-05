package com.proleesh.ex08;

public class FamilyTest {
    public static void main(String[] args) {
        Children c = new Children();

        Children c1 = new Children("호날두", 18, "축구");
        System.out.println("자녀의 이름: "  + c1.name);
        System.out.println("자녀의 나이: "  + c1.age);
        System.out.println("자녀의 취미: "  + c1.hobby);
    }
}
