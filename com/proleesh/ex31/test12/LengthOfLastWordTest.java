package com.proleesh.ex31.test12;

public class LengthOfLastWordTest {
    void main(){
        String str = "Hello World";
        System.out.println(lengthOfLastWord(str));

        str = " fly me to the moon ";
        System.out.println(lengthOfLastWord(str));
    }
    public int lengthOfLastWord(String s){
        s = s.trim();
        int length = 0;

        for(int i=s.length() - 1; i >= 0; --i){
            if(s.charAt(i) == ' '){
                break;
            }
            length++;
        }
        return length;
    }
}
