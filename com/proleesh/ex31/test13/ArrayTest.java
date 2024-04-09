package com.proleesh.ex31.test13;

public class ArrayTest {
    void main(){
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; ++i){
            arr[i] = i;
        }

        int[] newArr = new int[20];

        for(int i = 0; i < arr.length; ++i){
            newArr[i] = arr[i];
        }

        newArr[10] = 11;

        for(int i = 0; i < newArr.length; ++i){
            System.out.print(STR."\{newArr[i]} ");
        }
    }
}
