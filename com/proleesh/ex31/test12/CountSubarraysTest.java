package com.proleesh.ex31.test12;

public class CountSubarraysTest {
    void main(){
        int [] nums = {1,3,5,2,7,5};
        int minK = 1, maxK = 5;

        System.out.println(countSubarrays(nums, minK, maxK));




    }

    public long countSubarrays(int[] nums, int minK, int maxK){
        long res = 0;
        int badIdx = -1, leftIdx = -1, rightIdx = -1;

        for(int i = 0; i < nums.length; ++i){
            if(!(minK <= nums[i] && nums[i] <= maxK)){
                badIdx = i;
            }
            if(nums[i] == minK){
                leftIdx = i;
            }
            if(nums[i] == maxK){
                rightIdx = i;
            }
            res += Math.max(0, Math.min(leftIdx, rightIdx) - badIdx);
        }
        return res;
    }
}
