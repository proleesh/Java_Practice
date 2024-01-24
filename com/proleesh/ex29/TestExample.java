package com.proleesh.ex29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestExample {
    public static void main(String[] args) {
        List<String> humans = new ArrayList<>();
        humans.add("B");
        humans.add("A");
        humans.add("D");
        humans.add("C");

//        Collections.sort(humans, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(humans);
//
//        Collections.sort(humans, (x, y) -> {
//           return y.compareTo(x);
//        });
//
//        System.out.println(humans);

        Collections.sort(humans, String::compareTo);
        System.out.println(humans);

//        new Thread(
//                new Runnable() {
//                    @Override
//                    public void run() {
//                        System.out.println("Hello World!");
//                    }
//                }
//        ).start();

        new Thread(()-> System.out.println("Hello World!")).start();
    }
}
