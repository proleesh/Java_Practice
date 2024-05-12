package com.proleesh.ex34.arraybasic;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 5, 20, 12};
        int[] prices;
        prices = nums;
        for(int i = 0; i < prices.length; ++i){
            System.out.println(prices[i]);
        }
        prices[2] = 34;
        System.out.println("nums 배열의 3번째 원소 값은: " + nums[2]);
        prices[1] = 20;
        System.out.println("nums 배열의 2번째 원소 값은: " + nums[1]);
    }
}
