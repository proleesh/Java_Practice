package com.proleesh.ex31.test12;

public class PlusOne {
    void main(){
        int[] digArr = {1, 2, 3};
        System.out.print("old: ");
        for(int digA : digArr){
            System.out.print(STR." \{digA} ");
        }
        System.out.println();
        System.out.print("new: ");
        int[] result = plusOne(digArr);
        for(int res : result){
            System.out.print(STR." \{res} ");
        }
    }

    public int[] plusOne(int[] digits){
        for(int i = digits.length - 1; i >= 0; --i){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            // If not less than 9
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
