package com.proleesh.ex33;

public class RichestCustomerWealthTest {
    void main(){
        int[][] act = {
                {1, 2, 3},
                {3, 2, 1}
        };
        System.out.println(maximumWealth(act));

        int[][] act2 = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(act2));

    }

    public int maximumWealth(int[][] accounts){
        int n = accounts.length;
        int m = accounts[0].length;

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; ++i){
            int sum = 0;
            for(int j = 0; j < m; ++j){
                sum += accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
