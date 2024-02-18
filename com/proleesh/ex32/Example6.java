package com.proleesh.ex32;

/**
 * projectName: 구간합 구하기
 * author: Sung-Hyuk Lee
 * date: 02.18.2024
 */
public class Example6 {
    public static void main(String[] args) {
        long[] A = {15, 13, 10, 7, 3, 12};
        long[] S = new long[A.length];


        for(int i = 0; i < A.length; ++i){
            System.out.print(A[i] + "\t");
        }
        System.out.println();

        for(int i = 0; i < A.length; ++i){

            S[0] = A[0];
            if(i > 0){
                S[i] = S[i - 1] + A[i];
            }
            System.out.print(S[i] + "\t");
        }
    }
}
