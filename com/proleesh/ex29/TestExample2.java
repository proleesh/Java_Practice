package com.proleesh.ex29;

import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestExample2 {
    public static void main(String[] args) {
        // Function Interface 몇가지 방법

        // 입력 값 있고 리턴 값 없음
        BiConsumer<String, Integer> man = (x, y) -> {
            System.out.println("이름: " + x + ", 나이: " + y);
        };

        man.accept("이성혁", 2024 - 1999);


        // 입력 값 있고 리턴 값 있음
        Function<String, Integer> woman = Integer::parseInt;
        System.out.println("여성 나이: " + woman.apply("19"));

        // 입력 값 없고 리턴 값 없음
        Runnable runnable = () -> System.out.println(18);
        new Thread(runnable).start();

        // 입력 값 없고 리턴 값 있음
        Supplier<String> supplier = () -> UUID.randomUUID().toString();
        String s = supplier.get();
        System.out.println(s);


    }
}
