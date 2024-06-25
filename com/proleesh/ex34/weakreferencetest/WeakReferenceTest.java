package com.proleesh.ex34.weakreferencetest;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args) {
        String str = new String("자바 마스터");
        WeakReference<String> wr = new WeakReference<>(str);
        // str reference 와 '자바 마스터'의 레프렌스를 끊기기
        str = null;
        System.out.println(wr.get());
        System.gc();
        System.out.println(wr.get());
    }
}
