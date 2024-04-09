package com.proleesh.ex31.test13;

public class ArrayTest2 {
    void main(){
        int [] arr = new int[10];

        for(int i = 0; i < 5; ++i){
            arr[i] = i;
        }

        for(int i = 1; i < 4; ++i){
            arr[i] = arr[i + 2];
        }

        arr[4] = -1;

        for(int i = 0; i < 5; ++i){
            System.out.print(arr[i] + " ");
        }
    }
}
