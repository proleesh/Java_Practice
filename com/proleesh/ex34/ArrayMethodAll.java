package com.proleesh.ex34;

public class ArrayMethodAll {
    public static void main(String[] args) {
        double[] arr = {2, 5, 8.3, 3.2, 8.29, 7};
        System.out.println(max(arr));

        System.out.println(avg(arr));

        double[] b = new double[arr.length];
        for(int i = 0; i < arr.length; ++i){
            b[i] = arr[i];
            System.out.print(b[i] + " ");
        }

        System.out.println();
        convertArr(arr);
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }




    }
    public static double max(double[] arr) {
        double max = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    public static double avg(double[] arr) {
        int N = arr.length;
        double sum = 0.0;
        for(int i = 0; i < N; ++i){
            sum += arr[i];
        }
        return  sum / N;
    }

    public static double[] convertArr(double[] arr){
        int N = arr.length;
        for(int i = 0; i < N/2; ++i){
            double temp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - i - 1] = temp;
        }
        return arr;
    }

}
