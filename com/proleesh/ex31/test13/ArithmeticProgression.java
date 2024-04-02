package com.proleesh.ex31.test13;

import java.util.Arrays;

public class ArithmeticProgression {
    void main(){
        int [] arr = {3, 5, 1};
        System.out.println(ArithmeticProgress(arr));

        int [] arr2 = {1, 2, 4};
        System.out.println(ArithmeticProgress(arr2));
    }

    public boolean ArithmeticProgress(int [] arr){
        Arrays.sort(arr);

        int d = arr[1] - arr[0];
        for(int i = 1; i < 3; ++i){
            if(arr[i] - arr[i - 1] != d){
                return false;
            }
        }
        return true;
    }
}
