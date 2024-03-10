package com.proleesh.ex33.java17;

public class TextBlock {
    public static void main(String[] args) {
        String sName = "Michael Jackson";
        String tbName = """
                Michael Jackson""";
        System.out.println(sName.equals(tbName)); // true
        System.out.println(sName == tbName);
        System.out.println(tbName.substring(5)); // begin with 'e'
    }
}
