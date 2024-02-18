package com.proleesh.ex32;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        int M = 0;
        double result = 0;
        for(int i = 0; i < A.length; ++i){
            A[i] = sc.nextInt();
            if(A[0] <= A[i]) {
                A[0] = A[i];
                M = A[0];
            }
            result += A[i];
        }
        result = result/M*100/N;
        System.out.print(result);



    }
}
