package com.proleesh.ex31.test13;

public class QuickSort_2 {
    final int INT_MAX = Integer.MAX_VALUE;
    void main(){
        int [] A = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3, INT_MAX};
        int n = 11, i;

        QuickSort(A, 0, 10);

        for(i = 0; i < n - 1; ++i){
            System.out.print(STR."\{A[i]} ");
        }
        System.out.println();
    }

    public void QuickSort(int[] A, int l, int h){
        int j;
        if(l < h){
            j = partition(A, l, h);
            QuickSort(A, l, j );
            QuickSort(A, j+1, h);
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

            if(i < j) {
                swap(A, i, j);
            }
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
