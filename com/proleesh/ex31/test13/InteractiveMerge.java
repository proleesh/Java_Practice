package com.proleesh.ex31.test13;

public class InteractiveMerge {
    void main(){
        int [] A = {11, 13, 7, 12, 16, 9, 24, 5, 10, 3};

        IMergeSort(A, A.length);

        for(int i = 0; i < A.length; ++i){
            System.out.print(STR."\{A[i]} ");
        }
        System.out.println();
    }

    public void merge(int[] A, int l, int mid, int h){
        int[] B = new int[100];

        int i = l, j = mid + 1, k = l;


        while(i <= mid && j <= h){
            if(A[i] < A[j]){
                B[k++] = A[i++];
            }else{
                B[k++] = A[j++];
            }
        }

        for(; i <= mid; ++i){
            B[k++] = A[i];
        }
        for(; j <= h; ++j){
            B[k++] = A[j];
        }

        for(int t = l; t <= h; ++t){
            A[t] = B[t];
        }
    }

    public void IMergeSort(int [] A, int n){
        int p, l, h, mid, i;
        for(p=2; p <= n; p *= 2){
            for(i = 0; i + p -1 <= n; i += p){
                l = i;
                h = i + p - 1;
                mid = (l + h) / 2;
                merge(A, l, mid, h);
            }
        }
        if(p/2 < n){
            merge(A, 0, p/2 - 1, n-1);
        }
    }



}
