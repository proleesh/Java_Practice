package com.proleesh.ex28;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListExample {
    public static void main(String[] args) {
        Set<String> countries = new ConcurrentSkipListSet<>();
        countries.add("Korea");
        countries.add("USA");
        countries.add("Japan");
//        countries.add("C");
//        countries.add("A");
//        countries.add("D");

        for(String country:countries){
            System.out.println(country);
        }

        Map<String, Integer> map = new ConcurrentSkipListMap<>();
        map.put("C", 14);
        map.put("B", 98);
        map.put("A", 52);

        for(String key:map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }

        for(Integer value:map.values()){
            System.out.println(value);
        }

    }
}
