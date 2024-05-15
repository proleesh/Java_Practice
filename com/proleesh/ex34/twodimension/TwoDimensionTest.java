package com.proleesh.ex34.twodimension;

public class TwoDimensionTest {
    public static void main(String[] args) {
        /*
        int[][][]의 배열 타입은 int[][]
        int[][]의 배열 타입은 int[]
        int[]의 배열 타입은 int
        즉 int[]...N 의 배열 타입은 int []...N - 1
         */
        int[][] a;
        // a 배열의 배열 원소 이기도 하고 reference type 이기도 하다
        // a 배열의 길이는 4
        a = new int[4][];
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        // a 배열 첫번째 원소 초기화
        a[0] = new int[2];
        // access 배열 첫번째 원소가 가리키는 두번째 원소
        a[0][1] = 6;
        // a 배열의 첫번째 원소는 1차원 배열, looping this array
        for(int i = 0; i < a[0].length; i++){
            System.out.println(a[0][1]);
        }

    }
}
