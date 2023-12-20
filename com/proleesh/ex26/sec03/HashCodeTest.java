package com.proleesh.ex26.sec03;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class HashCode{
    private String name;
    private int age;

    public HashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCode hashCode = (HashCode) o;
        return age == hashCode.age && Objects.equals(name, hashCode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
public class HashCodeTest {
    private static Map<HashCode, String> map = new HashMap<>();
    public static void main(String[] args) {
        HashCode hc1 = new HashCode("AAA", 12);
        HashCode hc2 = new HashCode("BBB", 15);
        System.out.println("AAA hashcode: " + hc1.hashCode());
        System.out.println("BBB hashcode: " + hc2.hashCode());
        map.put(hc1, "Korean");
        map.put(hc2, "Japanese");
        System.out.println(map.get(hc1));
        System.out.println(map.get(hc2));
    }
}
