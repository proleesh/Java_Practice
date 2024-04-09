package com.proleesh.ex31.test13;

public class QuickSort_Prac {
    final int MAX_VALUE = Integer.MAX_VALUE;
    void main(){
        int[] nums = {5, 2, 5, 1, 9, 4, 6, 14, 30, MAX_VALUE};

        long startTime = System.nanoTime();
        quickSort(nums, 0, nums.length - 1);
        long endTime = System.nanoTime();

        System.out.println();

        for(int i = 0; i < nums.length; ++i){
            System.out.print(STR."\{nums[i]} ");
        }

        System.out.println();

        long elapsedTime = endTime -startTime;
        System.out.println("QuickSort 소비 시간: " + elapsedTime / 1e9 + "초");

    }
    public void quickSort(int[] nums, int l, int h){
        int j;
        if(l < h){
            j = partition(nums, l, h);
            quickSort(nums, l, j);
            quickSort(nums, j + 1, h);
        }
    }

    public int partition(int[] A, int l, int h){
        int pivot = A[l];
        int i = l, j = h;
        do{
            do{
                i++;
            }while(A[i] <= pivot);
            do{
               j--;
            }while(A[j] > pivot);
            if(i < j) swap(A, i, j);
        }while(i < j);

        swap(A, l, j);

        return j;
    }

    public void swap(int[] A, int x, int y){
        int temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
