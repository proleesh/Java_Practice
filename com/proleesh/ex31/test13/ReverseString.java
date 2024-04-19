package com.proleesh.ex31.test13;

public class ReverseString {
    void main(){
        char[] s = {
                'h',
                'e',
                'l',
                'l',
                'o'
        };
        reverseString(s);
        for(char c : s){
            System.out.print(c + " ");
        }
    }
    public void reverseString(char[] s){
        int l = 0;
        int r = s.length - 1;

        while(l < r){
            swap(s, l, r);
            l++;
            r--;
        }
    }

    public void swap(char[]s, int x, int y){
        char temp = s[x];
        s[x] = s[y];
        s[y] = temp;
    }
}
