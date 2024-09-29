package com.proleesh.ex34;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    public int size(){
        if(rest == null){
            return 1;
        }
        return 1 + rest.size();
    }

    public static void main(String[] args) {
//        IntList list = new IntList();
//        list.first = 5;
//        list.rest = null;
//
//        list.rest = new IntList();
//        list.rest.first = 10;
//
//        list.rest.rest = new IntList();
//        list.rest.rest.first = 15;
        IntList L = new IntList(15, null);
        L = new IntList(10 , L);
        L = new IntList(5, L);
        System.out.println(L.first);
        System.out.println(L.rest);
        System.out.println(L.size());
    }
}
