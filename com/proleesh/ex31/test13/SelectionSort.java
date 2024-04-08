package com.proleesh.ex31.test13;

public class SelectionSort {
    void main(){
//        int [] nums = {8, 6, 3, 2, 5, 4};

        int [] nums = new int[200000];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int) (Math.random() * 1000000);
        }
        long startTime = System.nanoTime();
        selectionSort(nums, nums.length);
        long endTime = System.nanoTime();

        for(int i = 0; i < nums.length; ++i){
            System.out.print(STR."\{nums[i]} ");
        }

        System.out.println();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime / 1e9 + "초");
    }

    public void selectionSort(int[] A, int n){
        int k, j;
        for(int i = 0; i < n-1; ++i){
            for(k = j = i; j < n; ++j){
                if(A[k] > A[j]){
                    k = j;
                }
            }
            swap(A, i, k);
        }
    }

    public static void swap(int[] A, int x, int y){
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
