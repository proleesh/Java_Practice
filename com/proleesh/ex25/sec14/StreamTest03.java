package com.proleesh.ex25.sec14;

import java.util.ArrayList;
import java.util.List;

public class StreamTest03 {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.add(33);
        lists.add(32);
        lists.add(52);
        lists.add(13);
        lists.add(89);


        int[] arr1 = new int[lists.size()];
        for(int i = 0; i < arr1.length; ++i){
            arr1[i] = lists.get(i);
            System.out.println(arr1[i]);
        }

        System.out.println(arr1.getClass().getTypeName());


        int[] arr2 = lists.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        for(int a2 : arr2){
            System.out.println(a2);
        }
        System.out.println(arr2.getClass().getTypeName());


    }
}
