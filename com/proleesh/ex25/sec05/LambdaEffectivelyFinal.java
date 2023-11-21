package com.proleesh.ex25.sec05;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEffectivelyFinal {
    String name = "";

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("John");
        al.add("Sebastian");
        al.add("Katty");

        int x = 12;
        Predicate<String> lambda = s -> {
            new LambdaEffectivelyFinal().name= "Kennedy";
            System.out.println("x == " + x); // x == 12
            return s.isEmpty() && x % 2 == 0;
        };
        filterData(al, lambda);
        System.out.println(al); // [John, Sebastian, Katty]

        new LambdaEffectivelyFinal().name = "Jack";
        filterData(al, lambda);


    }
    public static void filterData(List<String> list,Predicate<String> lambda){
        Iterator<String> i = list.iterator();
        while(i.hasNext()){
            if(lambda.test(i.next())){
                i.remove();
            }
        }
    }
}
