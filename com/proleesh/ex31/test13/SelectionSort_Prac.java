package com.proleesh.ex31.test13;

public class SelectionSort_Prac {
    void main(){
//        int[] nums = {4, 6, 7, 2, 1, 9, 5};

        int[] nums = new int[400000];

        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random() * 1000000);
        }

        long startTime = System.nanoTime();

        selectionSort(nums, nums.length);

        long endTime = System.nanoTime();

        for(int i=0; i<nums.length; i++){
            System.out.print(STR."\{nums[i]} ");
        }

        System.out.println();
        long elapsedTime = endTime - startTime;

        System.out.println(STR."시간: \{elapsedTime / 1e9} 초를 사용함." );

    }

    public void selectionSort(int[] arr, int n){
        int k, j;
        for(int i = 0;i < n - 1;++i){
            for(k = j= i; j < n; ++j){
                if(arr[k] > arr[j]){
                    k = j;
                }
            }
            swap(arr, i, k);
        }
    }
    public void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
