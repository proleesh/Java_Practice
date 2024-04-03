package com.proleesh.ex31.test13;

public class SquareSortedArray_Prac {
    void main(){
        int[] nums = {-4, -1, 0, 3, 10};
        for(int num : nums){
            System.out.print(STR."\{num} ");
        }
        System.out.println();
        for(int num : sortedSquares(nums)){
            System.out.print(STR."\{num} ");
        }
    }

    public int[] sortedSquares(int[] nums){
        int [] ans = new int[nums.length];
        int L = 0, R = nums.length-1, end = nums.length-1;

        while(L <= R){
            if(Math.abs(nums[L]) > Math.abs(nums[R])){
                ans[end--] = nums[L] * nums[L];
                L++;
            }else{
                ans[end--] = nums[R] * nums[R];
                R--;
            }
        }
        return ans;
    }
}
