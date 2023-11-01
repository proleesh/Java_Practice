package com.proleesh.ex21.sec08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("이순신");
        list.add("김부식");

        Stream<String> stream = list.parallelStream();
        stream.forEach(t -> System.out.println(t + ": " + Thread.currentThread().getName()));
    }
}
