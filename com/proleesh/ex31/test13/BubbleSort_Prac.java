package com.proleesh.ex31.test13;

public class BubbleSort_Prac {
    void main(){
        int[] nums = {9, 2, 5, 8, 1, 3};
//        int[] nums = {1, 2, 3, 5, 8, 9};

        bubbleSort(nums, nums.length);

        for(int i = 0; i < nums.length; ++i){
            System.out.print(STR."\{nums[i]} ");
        }
    }

    public static void bubbleSort(int[] arr, int n){
        int flag = 0;
        for(int i = 0; i < n-1; ++i){
            for(int j = 0; j < n-i-1; ++j){
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.println("NO SORT FOUND");
        }else{
            System.out.println("SORT FOUND");
        }
    }

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
