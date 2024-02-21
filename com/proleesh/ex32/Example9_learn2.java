package com.proleesh.ex32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example9_learn2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N + 1][N + 1];

        for(int i = 1; i <= N; ++i){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; ++j){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] S = new int[N + 1][N + 1];

        for(int i = 1; i <= N; ++i){
            for(int j = 1; j <= N; ++j){
                S[i][j] = S[i][j-1] + S[i-1][j] - S[i-1][j-1] + A[i][j];
            }
        }

        for(int i = 0; i < M; ++i){
            st = new StringTokenizer(br.readLine());
            int X1 =  Integer.parseInt(st.nextToken());
            int Y1 =  Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());

            int result = S[X2][Y2] - S[X1-1][Y2] - S[X2][Y1-1] + S[X1-1][Y1-1];
            System.out.println(result);
        }

    }
}
