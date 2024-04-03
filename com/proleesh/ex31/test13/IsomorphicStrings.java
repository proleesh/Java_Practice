package com.proleesh.ex31.test13;

public class IsomorphicStrings {
    void main(){
/*        int[] x = new int[200];
        int[] y = new int[200];


        String s = "egg"; // 101, 103, 103
        String a = "adg"; // 97, 100, 100

        for (int i = 0; i < s.length(); ++i) {
            if (x[s.charAt(i)] != y[a.charAt(i)]) {
                System.out.println("같지 않습니다.");
            }
            x[s.charAt(i)] = i + 1;
            y[a.charAt(i)] = i + 1;
        }
        System.out.println("같습니다.");*/

        String str1 = "egg";
        String str2 = "add";

        System.out.println(isomorphicString(str1, str2));

        str2 = "age";
        System.out.println(isomorphicString(str1, str2));

    }

    public boolean isomorphicString(String s, String t){
        final int n = 200;
        int[] x = new int[n];
        int[] y = new int[n];

        int len = s.length();
        for(int i = 0; i < len; ++i){
            if(x[s.charAt(i)] != y[t.charAt(i)]){
                return false;
            }
            x[s.charAt(i)] = i + 1;
            y[t.charAt(i)] = i + 1;
        }
        return true;
    }


}
