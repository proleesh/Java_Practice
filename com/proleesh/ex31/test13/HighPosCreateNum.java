package com.proleesh.ex31.test13;

public class HighPosCreateNum {
    void main(){
        String s = "8964";
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            num = 10 * num + s.charAt(i) - '0';
            System.out.println(num);
        }
    }
}
