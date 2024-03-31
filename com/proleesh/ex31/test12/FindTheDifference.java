package com.proleesh.ex31.test12;

public class FindTheDifference {
    void main(){
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("qwert","qwera"));
        System.out.println(findTheDifference("", "w"));
    }

    public char findTheDifference(String s, String t){
        int [] a = new int[26];
        int [] b = new int[26];
        int n = t.length();
        for(int i = 0; i < n - 1; ++i){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            a[ch1-97]++; // a:0, b:1, c:2, d:3
            b[ch2-97]++;
        }
        b[t.charAt(n-1)-97]++;

        for(int i = 0; i < 26; ++i){
            if(a[i] != b[i]){
                return (char)(i + 97);
            }
        }
        return 'z';
    }
}
