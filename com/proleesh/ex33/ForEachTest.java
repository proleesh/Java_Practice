package com.proleesh.ex33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("C");
        list.add("B");
        list.add("E");
        list.add("D");

//        list.sort(new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });

        list.sort((Comparator<String>) Comparator.naturalOrder());

        System.out.println("For: ");
        for(int i = 0; i < 5; ++i){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();


        System.out.println("forEach(): ");
        list.stream().forEach(i -> System.out.print(i + " "));



    }
}
