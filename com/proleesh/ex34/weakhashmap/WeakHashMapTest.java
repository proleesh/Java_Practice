package com.proleesh.ex34.weakhashmap;

import java.util.Objects;
import java.util.WeakHashMap;

class CrazyKey{
    String name;

    public CrazyKey(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrazyKey crazyKey = (CrazyKey) o;
        return Objects.equals(name, crazyKey.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "CrazyKey{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class WeakHashMapTest {
    public static void main(String[] args) throws Exception{
        WeakHashMap<CrazyKey, String> weakHashMap = new WeakHashMap<>();
        for(var i = 0; i < 10; ++i){
            weakHashMap.put(new CrazyKey(i + 1 + ""), "value" + (i + 11));
        }
        System.out.println(weakHashMap);
        System.out.println(weakHashMap.get(new CrazyKey("2")));
        System.out.println(weakHashMap.get(new CrazyKey("3")));
        System.gc();
        Thread.sleep(50);
        System.out.println(weakHashMap);
        System.out.println(weakHashMap.get(new CrazyKey("2")));
        System.out.println(weakHashMap.get(new CrazyKey("3")));
    }
}
