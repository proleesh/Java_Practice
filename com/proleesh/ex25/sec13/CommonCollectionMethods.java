package com.proleesh.ex25.sec13;

import java.util.ArrayList;
import java.util.Collection;

public class CommonCollectionMethods {
    public static void main(String[] args) {
        // 중복 허용
        Collection<String> coll = new ArrayList<>();

        coll.add("Lucy");
        coll.add("April");
        coll.add("Lucy");
        System.out.println(coll);
        coll.remove("Lucy");
        System.out.println(coll);
        coll.forEach(System.out::println);
        coll.clear();
        if(coll.isEmpty()){
            System.out.println("비어있다.");
        }

    }
}
