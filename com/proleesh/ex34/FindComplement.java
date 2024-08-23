package com.proleesh.ex34;

public class FindComplement {
    public static void main(String[] args) {
        FindComplement f = new FindComplement();
        System.out.println(f.findComplement(5));
    }
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0') {
                res += "1";
            }else{
                res += "0";
            }
        }
        return Integer.parseInt(res, 2);
    }
}
