package com.proleesh.ex20;

import javax.swing.text.html.parser.Entity;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 10);
        treeMap.put("samsung", 30);
        treeMap.put("oneplus", 20);
        treeMap.put("oracle", 40);
        treeMap.put("Xiaomi", 50);
        treeMap.put("Huawei", 70);
        treeMap.put("SONY", 60);

        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        for (Map.Entry<String, Integer> entry :
                entrySet) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println();

        Map.Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞 단어: " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println("제일 뒤 단어: " + entry.getKey() + "-" + entry.getValue());
        entry = treeMap.lowerEntry("ever");
        System.out.println("ever 앞 단어: " + entry.getKey() + "-" + entry.getValue() + "\n");
        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        Set<Map.Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
        for(Map.Entry<String,Integer> e : descendingEntrySet){
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        System.out.println();

        System.out.println("[c-h 사이의 단어 검색]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c",true, "h", false);
        for(Map.Entry<String, Integer> e : rangeMap.entrySet()){
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
}
