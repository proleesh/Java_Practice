package com.proleesh.ex32;

public class Example17 {
    void main(){
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static int lengthOfLastWord(String s){
        s = s.trim();

        int length = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == ' ') {
                break;
            }
            length++;
        }
        return length;
    }
}
