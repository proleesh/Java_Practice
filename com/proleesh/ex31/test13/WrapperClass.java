package com.proleesh.ex31.test13;

public class WrapperClass {
    void main(){
        String str = "65";
//        int a = (int)str; 불가능 하다 그래서 이때 와퍼 클래스를 이용한다.
        int a = Integer.parseInt(str);
        System.out.println(a);

        // 아래 두 가지 모두 가능
        float b = 3.14f;
        float c = (float)3.14;
        System.out.println(b);
        System.out.println(c);
        System.out.println(b == c?"yes":"no");
    }
}
