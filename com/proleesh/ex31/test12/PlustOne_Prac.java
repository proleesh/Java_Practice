package com.proleesh.ex31.test12;

public class PlustOne_Prac {
    void main(){
        System.out.print("Original: ");
        int [] numArr = {4,3,2,1};
        for(int num : numArr){
            System.out.print(STR."\{num} ");
        }
        System.out.println();
        System.out.print("New: ");

        for(int num : plusOne(numArr)){
            System.out.print(STR."\{num} ");
        }
        System.out.println();
        System.out.print("Original: ");
        int [] numArr2 = {1,2,3};
        for(int num : numArr2){
            System.out.print(STR."\{num} ");
        }
        System.out.println();
        System.out.print("New: ");

        for(int num : plusOne(numArr2)){
            System.out.print(STR."\{num} ");
        }
    }
    /*
    Ex: 4 3 2 1
    for 1, 2, 3, 4
    if index value < 9, index++;
    return {1, 2, 3, 4}
    else or other = 0;

    digits new array = [5]
    index sequence: 0 1 2 3 4
    digits[0] = 1;

     */

    public int[] plusOne(int[] digits){
        for(int i = digits.length - 1; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++; // 1 + 1; or 4 + 1
                return digits; // 2
            }
            digits[i] = 0;

        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
