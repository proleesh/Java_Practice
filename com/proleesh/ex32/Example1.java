package com.proleesh.ex32;

public class Example1 {
    public static void main(String[] args) {
        int findNum = (int)(Math.random() * 100);
        for(int i = 0; i < 100; ++i){
            if(i == findNum){
                System.out.println(i);
                break;
            }
        }
    }
}
