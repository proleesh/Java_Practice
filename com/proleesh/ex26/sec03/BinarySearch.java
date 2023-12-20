package com.proleesh.ex26.sec03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        searchStrings();
        searchCats();
    }

    public static void searchStrings(){
        List<String> names = Arrays.asList("John", "Martin", "Paula", "Ann", "Tom", "Kim");
        Collections.sort(names);
        System.out.println(names);

        System.out.println(Collections.binarySearch(names, "John"));

        System.out.println(Collections.binarySearch(names, "Laura"));
    }

    public static void searchCats(){
        Cat fluffy = new Cat("Fluffy", 1);
        Cat bella = new Cat("Bella", 5);
        Cat tom = new Cat("Tom", 3);
        List<Cat> catList = Arrays.asList(fluffy, bella, tom);

        Collections.sort(catList);
        System.out.println(catList);

        System.out.println("Tom is at index: " + Collections.binarySearch(catList, tom));
        System.out.println("Fluffy is at index: " + Collections.binarySearch(catList, fluffy));
        System.out.println("Bella is at index: " + Collections.binarySearch(catList, bella));

        // 역전:
        catList.sort(Comparator.reverseOrder());
        System.out.println(catList);

        Comparator<Cat> byAge = Comparator.comparingInt(Cat::getAge);
        Collections.sort(catList, byAge);
        System.out.println(catList);
    }
}
