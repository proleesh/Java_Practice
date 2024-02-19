package com.proleesh.ex32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example9_learn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 2차원 배열의 크기, 구간의 합 질의의 개수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 기본 배열 저장
        int[][] A = new int[N + 1][N  + 1];
        for(int i = 1; i <= N; ++i){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; ++j){
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 합 배열 저장
        int[][] D = new int[N + 1][N + 1];
        for(int i = 1; i <= N; ++i){
            for(int j = 1; j <= N; ++j){
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        // 질의의 배열 값 구하기
        for(int i = 0; i < M; ++i){
            st = new StringTokenizer(br.readLine());
            int X1 = Integer.parseInt(st.nextToken());
            int Y1 = Integer.parseInt(st.nextToken());
            int X2 = Integer.parseInt(st.nextToken());
            int Y2 = Integer.parseInt(st.nextToken());

            int result = D[X2][Y2] - D[X1 - 1][Y2] - D[X2][Y1 - 1] + D[X1 - 1][Y1 - 1];
            System.out.println(result);
        }
    }
}
