package com.proleesh.ex31.test13;

public class IsomorphicStrings_Prac {
    void main(){
        String s = "egg";
        String t = "add";
        int[] x = new int[200];
        int[] y = new int[200];
        for(int i = 0; i < s.length(); ++i){
//            System.out.print(x[s.charAt(i)] + " ");
//            System.out.println();
            if(x[s.charAt(i)] != y[t.charAt(i)]){
                System.out.println("That not same!");
            }
            x[s.charAt(i)] = i + 1;
            y[t.charAt(i)] = i + 1;
        }
        System.out.println("That same!");
    }
}
