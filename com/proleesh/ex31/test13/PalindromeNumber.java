package com.proleesh.ex31.test13;

public class PalindromeNumber {
    void main(){
        System.out.println(isPalidrome(121));


    }
    public boolean isPalidrome(int x) {
        if(x < 0){
            return false;
        }
        long reversed = 0;
        long temp = x;
        while(temp != 0){
            int digit = (int)(temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return reversed == x;
    }
}
