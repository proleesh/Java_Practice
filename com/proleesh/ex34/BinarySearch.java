package com.proleesh.ex34;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11, 42, 33, 45, 94, 24};
        System.out.println(rank(45, arr));
    }
    public static int rank(int key, int[] a){
        int lo = 0;
        int hi = a.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid]) hi = mid - 1;
            else if(key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
