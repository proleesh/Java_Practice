package com.proleesh.ex31.test13;

public class QuickSort {
    void main(){
        int[] numArr = {1, 5, 8 ,9, 2, 4, 6, 3};
        sort(numArr, 0, numArr.length - 1);
        for(int i = 0; i < numArr.length; ++i){
            System.out.print(numArr[i] + " ");
        }

    }

    public static void sort(int[] nums, int lo, int hi){
        // pre-order
        if(lo < hi){
            int pivot = partition(nums, lo, hi);

            sort(nums, lo, pivot - 1);
            sort(nums, pivot + 1, hi);
        }
    }

    public static int partition(int[] nums, int lo, int hi){
        int pivot = nums[hi];
        int i = lo - 1;

        for(int j = lo; j < hi; ++j){
            if(nums[j] <= pivot){
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, hi);
        return i + 1;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
