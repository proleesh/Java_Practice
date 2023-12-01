package com.proleesh.ex25.sec13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingLists {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Alpha",
                "Beta",
                "Charlie"
        };
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

//        System.out.println(Arrays.toString(array));
        array[0] = "Delta";
        System.out.println(asList);

        asList.set(1, "Echo");
        System.out.println(Arrays.toString(array));
        System.out.println(asList);

        List<String> list = new ArrayList<>();
        list.add("Alan");
        list.add("Alan");
        list.add(1, "Sean");
        list.add("Mary");
        list.add("Mary");
        list.add(3,"Katty");
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(0);
        list.remove("Alan");
        System.out.println(list);
        // 지정 다시 설정
        list.set(0, "Jack");
        // 전부 다시 설정
        list.replaceAll(name->name+" Kennedy");
        System.out.println(list);

    }
}
