package com.proleesh.ex25.sec14;

import java.util.ArrayList;
import java.util.List;

public class StreamEx02 {
    public static void main(String[] args) {
        // Unboxed (Serialization)
        // ArrayList<Integer>를 Int Array로 변환
        List<Integer> lists = new ArrayList<>();
        lists.add(22);
        lists.add(87);
        lists.add(99);
        lists.add(24);

        // 1. 방법
        System.out.println("일반 방법");
        int[] arr1 = new int[lists.size()];
        for(int i = 0; i < arr1.length; ++i){
            arr1[i] = lists.get(i);
            System.out.println(arr1[i]);
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(arr1.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        // 2. Lambda Expression
        System.out.println("Lambda Expression 이용");
        int[] arr2 = lists.stream()
                .mapToInt(i -> i)
                .toArray();
        for(int i: arr2){
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(arr2.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        // 3. Method Reference
        System.out.println("Method Reference 이용");
        int[] arr3 = lists.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        for(int i : arr3){
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(arr3.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        // 3. filter method 사용
        System.out.println("filter method 이용");
        int[] arr4 = lists.stream().filter(i -> i != null)
                .mapToInt(Integer::intValue)
                .toArray();
        for(int i : arr4){
            System.out.println(i);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println(arr4.getClass().getTypeName());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
