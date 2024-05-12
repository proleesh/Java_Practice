package com.proleesh.ex34.arraybasic;

public class ArrayTest2 {
    public static void main(String[] args) {
        // 정적 배열 초기화 첫번째 방식
        String[] books = new String[]
                {
                        "자바 마스터",
                        "스프링 마스터",
                        "분산 시스템 마스터",
                        "데이터베이스 마스터"
                };
        // 정적 배열 초기화 두번째 방식
        String[] names =
                {
                        "이순신",
                        "세종",
                        "홍길동"
                };
        // 동적 배열 초기화 방식
        String[] strArr = new String[5];
        // 배열 길이 계산
        System.out.println("첫번째: " + books.length);
        System.out.println("두번째: " + names.length);
        System.out.println("세번째: " + strArr.length);

        books = names;
        strArr = names;
        System.out.println("-------------");
        System.out.println("books의 길이: " + books.length);
        System.out.println("strArr의 길이: " + strArr.length);
        books[1] = "아무거나";
        System.out.println("names 배열의 두번째 원소는: " + books[1]);
    }
}
