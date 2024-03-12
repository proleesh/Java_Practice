package com.proleesh.ex32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Example13 {
    void main() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int count = 0;
        int[] A = new  int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; ++i){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);


        for(int k = 0; k < N; ++k){
            int find = A[k], i = 0, j = N - 1;
            while(i < j){
                if(A[i] + A[j] == find){
                    if(i != k && j != k) {
                        count++;
                        break;
                    }else if(i == k){ // i가 k가 맞을 때 포인터 변경 및 계속하기
                        i++;
                    }else if(j == k){ // j가 k가 맞을 때 포인터 변경 및 계속하기
                        j--;
                    }
                }else if(A[i] + A[j] < find){
                    i++;
                }else{
                    j--;
                }
            }
        }
        System.out.println(count);

    }
}
