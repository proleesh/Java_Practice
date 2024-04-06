package com.proleesh.ex31.test13;

public class PlusOne_Prac {
    void main(){
        int[] digits = {1, 2, 3};
        digits = plusOne(digits);
        for(int digit : digits){
            System.out.print(STR."\{digit} ");
        }
        System.out.println();

        int[] digits2 = {4, 3, 2, 1};
        digits2 = plusOne(digits2);
        for(int digit2 : digits2){
            System.out.print(STR."\{digit2} ");
        }
    }

    public int[] plusOne(int[] nums){

        for(int i = nums.length - 1; i >= 0; --i){
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }

        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }
}
