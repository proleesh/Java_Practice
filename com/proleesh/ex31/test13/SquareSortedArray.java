package com.proleesh.ex31.test13;

public class SquareSortedArray {
    void main(){
        int[] nums = {-4, -1, 0, 3, 10};
        for(int num : nums){
            System.out.print(STR."\{num} ");
        }

        System.out.println();

        for(int num : sortedSquares(nums)){
            System.out.print(STR."\{num} ");
        }

        System.out.println();
        int [] nums2 = {-7, -3, 2, 3, 11};

        for(int num2 : nums2){
            System.out.print(STR."\{num2} ");
        }
        System.out.println();

        for(int num2 : sortedSquares(nums2)){
            System.out.print(STR."\{num2} ");
        }

    }

    public int[] sortedSquares(int[] nums){
        int [] ans = new int[nums.length];
        int left = 0, right = nums.length - 1, end = nums.length - 1;
        while(left <= right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                ans[end--] = nums[left] * nums[left];
                left++;
            }else{
                ans[end--] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }
}
