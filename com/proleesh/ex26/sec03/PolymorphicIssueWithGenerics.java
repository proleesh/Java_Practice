package com.proleesh.ex26.sec03;

import java.util.ArrayList;
import java.util.List;

public class PolymorphicIssueWithGenerics {
    public static void showList(List<?> list){
        for(Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<Double>();
        doubles.add(12.3);
        doubles.add(2.3);
        doubles.add(24.6);
        showList(doubles);
//        List<Object> objects = doubles;
//        objects.add("This is a String");

        List<String> names = new ArrayList<>();
        names.add("Sean");
        names.add("Kali");
        names.add("Go");
        showList(names);

    }
}
