package com.proleesh.ex26.sec03;

import java.util.LinkedList;
import java.util.List;

public class ListClientExample {
    private List list;

    public ListClientExample() {
        list = new LinkedList();
        list.add("Java");
        list.add("Rust");
        list.add("C++");
    }

    public List getList() {
        return list;
    }

    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = lce.getList();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
    }
}
