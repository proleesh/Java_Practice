package com.proleesh.ex31.test13;

public class RemoveDuplicates {
    void main(){
        int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public int removeDuplicates(int[] nums){
        if(nums.length == 0) return 0;
        int slow = 0, fast = 0;
        while(fast < nums.length){
            if(nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
