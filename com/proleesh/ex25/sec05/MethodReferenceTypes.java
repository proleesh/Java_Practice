package com.proleesh.ex25.sec05;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MethodReferenceTypes {
    public static void main(String[] args) {
        boundMethodReferences();
        unboundMethodReferences();
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

    public static void unboundMethodReferences(){
        Function<String, String> upperL = s->s.toUpperCase();
        Function<String, String> upperMR = String::toUpperCase;

        System.out.println(upperL.apply("sean"));
        System.out.println(upperMR.apply("sean"));

        BiFunction<String, String, String> concatL = (s1, s2) -> s1.concat(s2);
        BiFunction<String, String, String> concatMR = String::concat;
        System.out.println(concatL.apply("Sean", "Kennedy"));


        System.out.println(concatMR.apply("Sean", "Kennedy"));

    }
}
