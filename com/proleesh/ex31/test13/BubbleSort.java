package com.proleesh.ex31.test13;

public class BubbleSort {
    void main(){
//        int [] nums = {8, 5, 7, 3, 2};
//        int [] nums = {2,3,5,7,8};
        int[] nums = new int[200000];
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = (int)(Math.random()*1000000);
        }
        long startTime = System.nanoTime();
        BubbleSort(nums, nums.length);
        long endTime = System.nanoTime();

        for(int i = 0; i < nums.length; i++){
            System.out.print(STR."\{nums[i]} ");
        }
        System.out.println();

        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime/1e9 + "초");
    }
    public static void BubbleSort(int[] nums, int n){
        int flag = 0;
        for(int i = 0; i < n-1; ++i){
            for(int j = 0; j < n - 1 - i; ++j){
                if(nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.println("Bubble sort stop");
        }
    }

    public static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
