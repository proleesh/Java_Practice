package com.proleesh.ex21.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart<T> {
    private List<T> items;

    public Cart(){
        items = new ArrayList<>();
    }

    public void add(T item){
        items.add(item);
    }

    public void printAllItems(){
        for(T item : items){
            System.out.println(item);
        }
    }
}
