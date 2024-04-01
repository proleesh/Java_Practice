package com.proleesh.ex31.test12;

public class MoveZeroes {
    void main(){
        int [] nums = {0,1,0,3,12};
        moveZeros(nums);
        for(int num : nums){
            System.out.print(STR."\{num} ");
        }
    }

    public void moveZeros(int[] nums){
        int left = 0;
        for(int right = 0; right < nums.length; ++right){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
