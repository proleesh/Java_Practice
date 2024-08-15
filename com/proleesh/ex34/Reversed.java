package com.proleesh.ex34;

public class Reversed {
    public static void main(String[] args) {
        Reversed r = new Reversed();
        System.out.println(r.reverse(123));
        System.out.println(r.reverse(987654321));
        System.out.println(r.reverse(-987654321));
        System.out.println(r.reverse(-980));


    }

    public int reverse(int x) {
        int reversed = 0;
        while(x != 0){
            int digit = x % 10;
            x /= 10;

            if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)){
                return 0;
            }
            if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)){
                return 0;
            }
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
