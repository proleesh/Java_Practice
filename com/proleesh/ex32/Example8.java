package com.proleesh.ex32;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Example8{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int inputNum = Integer.parseInt(stringTokenizer.nextToken());
        int quizNum = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[inputNum + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= inputNum; ++i){
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q = 0; q < quizNum; ++q){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }

    }
}
