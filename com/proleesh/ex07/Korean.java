package com.proleesh.ex07;

public class Korean {
    final String nation = "Korea";
    final String ssn;

    String name;

    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
}

class KoreanTest{
    public static void main(String[] args) {
        Korean k1 = new Korean("123-456","홍길동");
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

//        k1.ssn = "789-101"; final 변수는 수정이 불가능
    }
}
