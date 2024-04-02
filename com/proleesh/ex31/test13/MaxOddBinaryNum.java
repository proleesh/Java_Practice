package com.proleesh.ex31.test13;

public class MaxOddBinaryNum {
    void main(){
        String nums = "010";
        System.out.println(maximumOddBinaryNumber(nums));
        nums = "0101";
        System.out.println(maximumOddBinaryNumber(nums));
        nums = "0011";
        System.out.println(maximumOddBinaryNumber(nums));
        nums = "01011";
        System.out.println(maximumOddBinaryNumber(nums));

    }

    public String maximumOddBinaryNumber(String s){
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '1'){
                count++;
            }
        }
        for(int i = 0; i < s.length() - 1; ++i){
            if(count > 1){
                count--;
                sb.append('1');
            }else{
                sb.append('0');
            }
        }

        sb.append('1');
        return sb.toString();
    }
}
