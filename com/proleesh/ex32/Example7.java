package com.proleesh.ex32;

public class Example7 {
    public static void main(String[] args) {
        long [] A = {0, 5, 4, 3, 2, 1};
        long [] S = new long[A.length];


        for(int i = 1; i < A.length; ++i){
            S[i] = S[i - 1] + A[i];
            System.out.print(S[i] + " ");
        }
        System.out.println();

        // S[j] - S[i - 1]를 이용해 구간 합을 완성하세요
        int i = 1;
        int j = 3;
        System.out.println("(" + i + ", " + j + ")");
        System.out.println(S[j] - S[i - 1]);

        i = 2;
        j = 4;

        System.out.println("(" + i + ", " + j + ")");
        System.out.println(S[j] - S[i - 1]);

        i = 5;
        j = 5;

        System.out.println("(" + i + ", " + j + ")");
        System.out.println(S[j] - S[i - 1]);
    }
}
