package com.proleesh.ex25.sec14;

import java.util.Arrays;

public class StreamTest04 {
    public static void main(String[] args) {
        int[] smart = {11, 33, 66, 77, 99};

        Integer[] stream = Arrays.stream(smart)
                .boxed()
                .toArray(Integer[]::new);

        for(Integer i : stream){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(stream.getClass().getTypeName());
    }
}
