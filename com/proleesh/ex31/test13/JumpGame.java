package com.proleesh.ex31.test13;

public class JumpGame {
    void main(){
        int [] nums = {2, 3, 1, 1, 4};

        System.out.println(jump(nums));

    }

    public int jump(int[] nums){
        int n = nums.length;
        int end = 0, farthest = 0;
        int jumps = 0;
        for(int i = 0; i < n - 1; ++i){
            farthest = Math.max(i+nums[i], farthest);
            if(end == i){
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}
