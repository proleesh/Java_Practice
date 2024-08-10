package com.proleesh.ex34;

public class ExpressionValue {
    public static void main(String[] args) {
        int res1 = (0 + 15) / 2;
        System.out.println(res1);

        double res2 = 2.0e-6*100000000.1;
        System.out.println(res2);

        boolean res3 = true && false || true && true;
        System.out.println(res3);

        double res4 = (1 + 2.236)/2;
        System.out.println(res4);

        double res5 = 1 + 2 + 3 + 4.0;
        System.out.println(res5);

        boolean res6 = 4.1 >= 4;
        System.out.println(res6);

        String res7 = 1 + 2 + "3";
        System.out.println(res7);

        int num1 = 10, num2 = 10, num3 = 10;

        if(num1 == num2 && num2 == num3 && num3 == num1){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }


    }
}
