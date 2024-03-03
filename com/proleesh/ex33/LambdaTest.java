package com.proleesh.ex33;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("C");

        System.out.println("Before: " + list);

        // 익명 클래스(Anonymous Class) 사용시
//        list.sort(new Comparator<String>(){
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
        // 람다 클래스(Lambda Class) 사용시
        list.sort((Comparator<String>) (str1, str2) -> str1.compareTo(str2));
        System.out.println("After: " + list);

    }
}
