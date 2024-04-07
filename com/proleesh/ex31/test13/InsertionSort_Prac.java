package com.proleesh.ex31.test13;

public class InsertionSort_Prac {
    void main(){
        int[] nums = {9, 2, 5, 8, 1, 3};
        InsertSort(nums, nums.length);

        for(int i = 0; i < nums.length; ++i){
            System.out.print(STR."\{nums[i]} ");
        }

    }
    public static void InsertSort(int[] arr, int n){
        for(int i = 1; i < n; ++i){
            int j = i - 1;
            int tmp = arr[i];
            while(j > -1 && arr[j] > tmp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }
}
