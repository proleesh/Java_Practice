package com.proleesh.ex34.stringjoin;

public class StringJoinTest2 {
    public static void main(String[] args) {
        var str1 = "Hello Java의 길이는 10";
        // .length()라는 메서드를 사용했기 때문에 컴파일 시 확인 불가
        var str2 = "Hello " + "Java" + "의 길이는:" + "Hello Java".length();
        System.out.println(str1 == str2); // False

        var len = 10;
        // len라는 변수를 사용했기 때문에 컴파일 시 확인 불가
        var str3 = "Hello " + "Java" + "의 길이는: " + len;
        System.out.println(str1 == str3); // False


    }
}
