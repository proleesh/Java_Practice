package com.proleesh.ex32;

public class Example16 {

    void main(){
        int [] nums = {2, 2, 1};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
