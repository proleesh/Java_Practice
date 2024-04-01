package com.proleesh.ex31.test12;

public class FindStrIndex_Prac {
    void main(){
        String str1 = "leetcode";
        String str2 = "leeta";

        System.out.println(strStr(str1, str2));

        str1 = "sadbutsad";
        str2 = "sad";
        System.out.println(strStr(str1, str2));

    }

    public int strStr(String hayStack, String needle){
        int haystacklength = hayStack.length();
        int needlelength = needle.length();

        if(haystacklength < needlelength){
            return -1;
        }

        for(int i = 0; i <= haystacklength - needlelength; ++i){
            int j = 0;
            while(j < needlelength && hayStack.charAt(i + j) == needle.charAt(j)){
                j++;
                if(j == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
