package com.proleesh.ex21.sec14;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("이재용");
        list.add("김자바");
        list.add("김자바");
        list.add("왕자바");

        // 중복 요소 제거
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println();

        // 김으로 시작 하는 요소만 필터링
        list.stream()
                .filter(n -> n.startsWith("김"))
                .forEach(System.out::println);
        System.out.println();

        // 중복 요소를 먼저 제거 하고, 김으로 시작 하는 요소만 필터링
        list.stream()
                .distinct()
                .filter(n -> n.startsWith("김"))
                .forEach(System.out::println);
        System.out.println();
    }
}
