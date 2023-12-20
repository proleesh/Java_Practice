package com.proleesh.ex26.sec03;

import java.util.ArrayList;
import java.util.List;

public class ListClientExampleTest {
    public static void main(String[] args) {
        ListClientExample lce = new ListClientExample();
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list = lce.getList();
        System.out.println(list);
    }
}
