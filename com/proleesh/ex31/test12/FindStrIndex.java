package com.proleesh.ex31.test12;

public class FindStrIndex {
    void main(){
        String str1= "sadbutsad";
        String str2 = "sad";
        System.out.println(findStrIndex(str1, str2));

        str1 = "leetcode";
        str2 = "code";
        System.out.println(findStrIndex(str1, str2));

    }

    public int findStrIndex(String haystack, String needle){
        int haylength = haystack.length();
        int needlelength = needle.length();
        if(haylength<needlelength){
            return -1;
        }
        for(int i=0; i<=haystack.length()-needle.length(); ++i){
            int j = 0;
            while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
                j++;
            }
            if(j == needle.length()){
                return i;
            }
        }
        return -1;
    }
}
