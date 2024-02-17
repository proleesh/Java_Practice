package com.proleesh.ex32;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        String sNum = sc.next();
        int result = 0;
        char[] cNum = sNum.toCharArray();
        for(int i = 0; i < cNum.length; ++i){
            // ascii 코드값을 조심
//            result += cNum[i] - '0';
            result += cNum[i] - 48;
        }
        System.out.println(result);


    }
}
