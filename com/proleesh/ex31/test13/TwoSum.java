package com.proleesh.ex31.test13;

import java.util.HashMap;

public class TwoSum {
    void main(){
        int[] nums = {2, 7, 11, 15};

        System.out.print("[");
        for(int num : twoSum(nums, 9)){
            System.out.print(num + " ");
        }
        System.out.print("]");

    }
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> valToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if(valToIndex.containsKey(need)){
                return new int[] {valToIndex.get(need), i};
            }
            valToIndex.put(nums[i], i);
        }
        return null;
    }
}
