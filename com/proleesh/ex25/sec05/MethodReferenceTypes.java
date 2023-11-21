package com.proleesh.ex25.sec05;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceTypes {
    public static void main(String[] args) {
        boundMethodReferences();
    }


    public static void boundMethodReferences(){
        String name = "Lee Sung-Hyuk";
        Supplier<String> lowerL = ()->name.toLowerCase();
        Supplier<String> lowerMR = name::toLowerCase;
        System.out.println(lowerL.get());
        System.out.println(lowerMR.get());

        Predicate<String> titleL = (title) ->name.startsWith(title);
        System.out.println(titleL.test("Lee"));

        Predicate<String> titleMR = name::startsWith;
        System.out.println(titleMR.test("Lee"));


    }
}
