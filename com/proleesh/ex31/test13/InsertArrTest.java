package com.proleesh.ex31.test13;

public class InsertArrTest {
    void main(){
        int [] arr = new int[10];
        for(int i = 0; i < 4; ++i){
            arr[i] = i;
        }
        for(int i = 4; i > 2; --i){
            arr[i] = arr[i - 1];
        }

        arr[2] = 666;

        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
    }
}
