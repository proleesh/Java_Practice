package com.proleesh.ex31.test13;

public class InsertionSort {
    void main(){
        int [] nums = {8, 5, 7, 3, 2};
//        int [] nums = {2, 3, 5, 7 ,8};
        insertSort(nums, nums.length);
        for(int i = 0; i < nums.length; ++i){
            System.out.print(STR."\{nums[i]} ");
        }
    }

    public static void insertSort(int [] nums, int n){
        for(int i = 1; i < n; ++i){
            int j = i - 1;
            int tmp = nums[i];
            while(j > -1 && nums[j] > tmp){
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = tmp;
        }
    }
}
