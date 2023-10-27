package com.proleesh.ex20.sec01;

import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("김수로", 40));
        treeSet.add(new Person("이순신", 35));

        for(Person person : treeSet){
            System.out.println(person.name + ":" + person.age);
        }
    }
}
