package com.proleesh.ex31.test13;

public class ToLowerCase {
    void main(){

        String str1 = "Hello";
        System.out.println(toLowerCase(str1));

        str1 = "GOOD BYE";
        System.out.println(toLowerCase(str1));

    }

    public String toLowerCase(String s){
        int len = s.length();
        char[] arr = s.toCharArray();
        for(int i = 0; i < len; ++i){
            if('A' <= arr[i] && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] - 'A' + 'a');
            }
        }
        return new String(arr);
    }
}
