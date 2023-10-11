package com.proleesh.ex13.sec11;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String");
            System.out.println("있습니다.");
        }catch (ClassNotFoundException e){
            System.out.println("없습니다.");
            e.getException();
        }
    }
}
