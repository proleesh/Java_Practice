package com.proleesh.ex25.sec05;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.*;

public class FI_from_API {
    public static void main(String[] args) {
        FI_from_API fiAPI = new FI_from_API();
        fiAPI.predicate();
        fiAPI.supplier();
        fiAPI.consumer();
        fiAPI.function();
        fiAPI.unaryBinaryOperator();
    }
    public void predicate(){
        Predicate<String> pStr = s -> s.contains("City");
        System.out.println(pStr.test("Seoul City"));

        BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
        System.out.println(checkLength.test("Seoul City", 10));
    }

    public void supplier(){
        Supplier<StringBuilder> supSB = StringBuilder::new;
        System.out.println("Supplier SB: " + supSB.get().append("SK"));

        Supplier<LocalTime> supTime = LocalTime::now;
        System.out.println("Supplier time: " + supTime.get());

        Supplier<Double> sRandom = Math::random;
        System.out.println(sRandom.get());

    }

    public void consumer(){
        Consumer<String> printC = System.out::println;
        printC.accept("Hello World");

        List<String> names = new ArrayList<>();
        names.add("Kim");
        names.add("Lee");
        names.forEach(printC);

        var mapCapitalCities = new HashMap<String,String>();
        // BiConsumer<String, String> biCon = (key, value) -> mapCapitalCities.put(key, value);
        BiConsumer<String, String> biCon = mapCapitalCities::put;
        biCon.accept("Seoul", "South Korea");
        biCon.accept("Beijing", "PRC");
        System.out.println(mapCapitalCities);

        BiConsumer<String, String> mapPrint = (key, value) -> System.out.println(key + "는 " + value +  "의 수도이다");
        mapCapitalCities.forEach(mapPrint);

    }

    public void function(){
        Function<String, Integer> fn2 = String::length;
        System.out.println("Function: " + fn2.apply("Shanghai"));

        BiFunction<String, String, Integer> biFn = (s1, s2) -> s1.length() + s2.length();
        System.out.println("BiFunction: " + biFn.apply("William", "Shakespeare"));

        BiFunction<String, String, String> biFn2 = String::concat;
        System.out.println("BiFunction: " + biFn2.apply("Lee", "Sung-Hyuk"));

    }

    public void unaryBinaryOperator(){
        UnaryOperator<String> unaryOp = name -> "My name is " + name;
        System.out.println("UnaryOperator: " + unaryOp.apply("Teddy"));

        BinaryOperator<String> binaryOp = String::concat;
        System.out.println("BinaryOperator: " + binaryOp.apply("Lee", "Sung-Hyuk"));
    }


}
