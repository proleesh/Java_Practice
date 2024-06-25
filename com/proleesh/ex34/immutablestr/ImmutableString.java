package com.proleesh.ex34.immutablestr;

public class ImmutableString {
    public static void main(String[] args) {
        var str = "Hello ";
        System.out.println(System.identityHashCode(str));
        str = str + "Java";
        System.out.println(System.identityHashCode(str));
        str = str + ", Proleesh";
        System.out.println(System.identityHashCode(str));
    }
}
