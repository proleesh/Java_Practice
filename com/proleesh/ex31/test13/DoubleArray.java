package com.proleesh.ex31.test13;

public class DoubleArray {
    void main(){

        int [][] arr = {
                {1, 2},
                {3, 4}
        };
        for(int i : convert2Dto1DByRow(arr)){
            System.out.print(STR."\{i} ");
        }


    }

    public static int[] convert2Dto1DByRow(int[][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int[] result = new int[m * n];
        int index = 0;
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < n; ++j){
                result[index++] = arr[i][j];
            }
        }
        return result;
    }
}
