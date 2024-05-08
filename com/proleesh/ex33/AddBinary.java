package com.proleesh.ex33;

public class AddBinary {
    void main(){
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));


    }

    public String addBinary(String a, String b){
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();

        StringBuilder sb = new StringBuilder();
        int m = a.length();
        int n = b.length();
        int carry = 0;
        int i = 0;

        while(i < Math.max(m,n) || carry > 0){
            int val = carry;
            val += i < m ? (a.charAt(i) - '0') : 0;
            val += i < n ? (b.charAt(i) - '0') : 0;
            sb.append(val % 2);
            carry = val / 2;
            i++;
        }

        return sb.reverse().toString();

    }
}
