package com.proleesh.ex33.record;

public class PrintTest {
    public static void main(String[] args) {
        PrintRecord java = new PrintRecord(1, "Java");
        java.print();
        PrintRecord rust = new PrintRecord(2, "Rust");
        rust.print();
    }
}
