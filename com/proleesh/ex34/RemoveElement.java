package com.proleesh.ex34;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();

        int[] arr1 = {3, 2, 2, 3};
        System.out.println(re.removeElement(arr1, 3)); // 2

        int[] arr2 = {2, 5, 6, 6, 7, 2};
        System.out.println(re.removeElement(arr2, 2)); // 4


    }
    public int removeElement(int[] nums, int val){
        int k = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
