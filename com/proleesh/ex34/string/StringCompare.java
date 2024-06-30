package com.proleesh.ex34.string;

public class StringCompare {
    public static void main(String[] args) {
        var s1 = new String("abc");
        var s2 = new String("z");
        var s3 = new String("abc");

        if(s1.compareTo(s3) == 0) {
            System.out.println("s1 와 s3의 문자열이 같습니다.");
        }

        if(s1.compareTo(s2) < 0){
            System.out.println("s1 가 s2보다 작다");
        }

        System.out.println("s1와 s3의 문자열이 같다? " + s1.equals(s3));
        System.out.println("s1와 s3가 지향한 문자열이 같다? " + (s1 == s3));
    }
}
