package com.proleesh.ex31.test13;

import java.util.HashSet;
import java.util.Set;

public class ContainsTest {
    void main(){

        String str = "Hello world";

        System.out.println(str.contains("Hello"));
        System.out.println(str.contains("hello"));
        System.out.println(str.contains("world"));
        System.out.println(str.contains("1"));

        Set<Integer> setInteger = new HashSet<>();

        setInteger.add(1);
        setInteger.add(3);
        setInteger.add(5);
        setInteger.add(7);
        setInteger.add(9);

        for(Integer i : setInteger){
            System.out.println(setInteger.contains(i));
        }
        // False, Not contains in set.
        System.out.println(setInteger.contains(2));
        // True
        System.out.println(setInteger.contains(5));



    }
}
