package com.proleesh.ex22.sec04;

import java.util.Arrays;

public class LoopingExample {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(System.out::println);

        int total = Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("총합: " + total + "\n");

        Arrays.stream(intArr)
                .filter(a -> a%2 == 0)
                .forEach(System.out::println);
    }
}
