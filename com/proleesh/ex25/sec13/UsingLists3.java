package com.proleesh.ex25.sec13;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UsingLists3 {
    public static void main(String[] args) {
        treeSet();
        hashSet();
        linkedHashSet();
    }

    public static void treeSet(){
        Set<String> names = new TreeSet<>();
        names.add("John");
        names.add("John"); // because duplicate so no show
        names.add("Helen");
        names.add("Anne");
        System.out.println(names);

        Set<Integer> numbers = new TreeSet<>();
        numbers.add(23);
        numbers.add(Integer.valueOf("21"));
        numbers.add(Integer.valueOf("11"));
        numbers.add(99);
        System.out.println(numbers);
    }

    public static void hashSet(){
        Set<Contact> contactHS = new HashSet<>();
        contactHS.add(new Contact("zoe", 45));
        contactHS.add(new Contact("zoe", 45));
        contactHS.add(new Contact("alice", 34));
        contactHS.add(new Contact("andrew", 35));
        contactHS.add(new Contact("brian", 36));
        contactHS.add(new Contact("carol", 37));

        for(Contact c : contactHS){
            System.out.println(c);
        }
        System.out.println();

    }
    public static void linkedHashSet(){
        Set<Contact> contactsHS = new LinkedHashSet<>();
        contactsHS.add(new Contact("zoe", 45));
        contactsHS.add(new Contact("zoe", 45));
        contactsHS.add(new Contact("alice", 34));
        contactsHS.add(new Contact("andrew", 35));
        contactsHS.add(new Contact("brian", 36));
        contactsHS.add(new Contact("carol", 37));

        for(Contact c : contactsHS){
            System.out.println(c);
        }
        System.out.println();
    }
}
