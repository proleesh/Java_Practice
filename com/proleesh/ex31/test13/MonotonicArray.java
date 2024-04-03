package com.proleesh.ex31.test13;

public class MonotonicArray {
    void main(){

        int [] numArr = {1, 2, 2 ,3};
        System.out.println(isMonotonic(numArr));
        int [] numArr2 = {6, 5, 4, 4};
        System.out.println(isMonotonic(numArr2));
        int [] numArr3 = {1, 3, 2};
        System.out.println(isMonotonic(numArr3));

    }

    public boolean isMonotonic(int [] nums){
        boolean isMonotonic = false;
        int f = 0;

        for(int i = 1; i < nums.length; ++i){
            if(nums[i] < nums[i - 1]){
                f = 1;
                break;
            }
        }
        if(f == 0) return true;

        f = 0;
        for(int i = 1; i < nums.length; ++i){
            if(nums[i] > nums[i - 1]){
                f = 1;
                return false;
            }
        }
        return true;
    }
}
