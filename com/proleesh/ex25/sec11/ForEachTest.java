package com.proleesh.ex25.sec11;

import java.util.stream.Stream;

public class ForEachTest {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Cathy", "Pauline", "Zoe");
        names.forEach(System.out::println);

        Stream<Integer> s = Stream.of(1, 2);
//        for(Integer i : s){}
        s.forEach(System.out::println);

    }
}
