package com.proleesh.ex34;

public class Euclid {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(gcd(num1, num2));
        num1 = 30;
        num2 = 100;
        System.out.println(gcd(num1, num2));
        num1 = 9;
        num2 = 900;
        System.out.println(gcd(num1, num2));
    }

    public static int gcd(int p, int q){
        if(q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
