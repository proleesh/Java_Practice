package com.proleesh.ex19.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer>map = new HashMap<>();

        map.put("사쿠라", 69);
        map.put("모모노기", 88);
        map.put("카렌", 76);
        map.put("아이", 24);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        String key = "아이";
        int value = map.get(key);
        System.out.println(key + " : " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while(keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = map.get(key);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("모모노기");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}
