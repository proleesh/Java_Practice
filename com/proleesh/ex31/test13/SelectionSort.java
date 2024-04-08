package com.proleesh.ex31.test13;

public class SelectionSort {
    void main(){
        int [] nums = {8, 6, 3, 2, 5, 4};

        long startTime = System.currentTimeMillis();
        selectionSort(nums, nums.length);


        for(int i = 0; i < nums.length; ++i){
            System.out.print(STR."\{nums[i]} ");
        }

        System.out.println();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }

    public void selectionSort(int[] A, int n){
        int k, j;
        for(int i = 0; i < n-1; ++i){
            for(k = j = i; j < n; ++j){
                if(A[k] > A[j]){
                    k = j;
                }
            }
            swap(A, i, k);
        }
    }

    public static void swap(int[] A, int x, int y){
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
