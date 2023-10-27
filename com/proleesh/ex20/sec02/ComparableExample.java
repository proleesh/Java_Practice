package com.proleesh.ex20.sec02;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
        treeSet.add(new Fruit("포도", 3000));
        treeSet.add(new Fruit("사과", 5000));
        treeSet.add(new Fruit("딸기", 6000));

        for (Fruit fruit:
             treeSet) {
            System.out.println(fruit.name + ":" +fruit.price);
        }
    }
}
