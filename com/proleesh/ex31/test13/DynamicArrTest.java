package com.proleesh.ex31.test13;

import java.util.ArrayList;

public class DynamicArrTest {
    void main(){
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < 10; ++i){
            // O(1)
            arr.add(i);
        }
        // O(n)
        arr.add(2, 666);

        // O(N)
        arr.add(0, -1);

        // O(1)
        arr.remove(arr.toArray().length - 1);

        // O(N)
        arr.remove(2);

        System.out.println(arr.get(2));
        System.out.println(arr.get(0));

        // (1)
        int a = arr.get(0);

        // O(1)
        arr.set(0, 100);

        // O(N)
        int index = arr.indexOf(666);

        System.out.println(index);
    }
}
