package com.proleesh.ex33;

import java.util.Optional;

public class OptionalTest {
    public static Optional<String> getString(){
//        return Optional.empty(); // always null
        return Optional.ofNullable("A B C");
    }
    public static void main(String[] args) {
        Optional<String> isThisNull = getString();

//        System.out.println((null!=isThisNull)?isThisNull.toUpperCase():"Error");

//        if(null != isThisNull){
//            System.out.println(isThisNull.toUpperCase());
//        }

        // If not empty and run ifPresent method.
        isThisNull.ifPresent(str-> System.out.println(str.toUpperCase())); // A B C
    }
}
