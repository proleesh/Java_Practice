package com.proleesh.ex33;

import java.util.Arrays;
import java.util.List;

public class StreamAPITest2 {
    public static void main(String[] args) {
        String[] lowerArr = new String[]{"Lee", "Kim", "Park"};


        System.out.println("Traditional: ");
        Arrays.stream(lowerArr)
                .forEach(v -> System.out.print(v + " "));


        System.out.println();

        System.out.println("New: ");
        List<String> list = Arrays.asList(lowerArr);
        list.stream()
                .map(v -> v.toUpperCase())
                .toList()
                .forEach(v -> System.out.print(v + " "));
    }
}
