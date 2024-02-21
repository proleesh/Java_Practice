package com.proleesh.ex32;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 수열의 개수
        int N = sc.nextInt();
        // 나누어떨어져야 하는 수
        int M = sc.nextInt();

        // 합 배열
        long[] S = new long[N];

        long[] C = new long[N];

        S[0] = sc.nextInt(); // S[0] = 1(input value)

        for(int i=1; i < N; ++i){
            S[i] = S[i - 1] + sc.nextInt();// 2, 3, 1, 2 (input value)
            // S[1] = 1 + 2 = 3
            // S[2] = 3 + 3 = 6
            // S[3] = 6 + 1 = 7
            // S[4] = 7 + 2 = 9
        }
        long result = 0;
        for(int i = 0; i < N; ++i){
            int remainder = (int) (S[i] % M);
            if(remainder == 0) result++;
            C[remainder]++;
        }
        for(int i = 0; i < M; ++i){
            if(C[i] > 1){
                result += (C[i] * (C[i] - 1) / 2);
            }
        }

        System.out.println(result);
    }
}
