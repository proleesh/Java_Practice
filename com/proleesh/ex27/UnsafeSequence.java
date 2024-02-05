//package com.proleesh.ex27;
//
//import net.jcip.annotations.NotThreadSafe;
//
//@NotThreadSafe
//public class UnsafeSequence {
//    private int value;
//
//    public int getNext(){
//        return value++;
//    }
//}
//class UnsafePrint{
//    public static void main(String[] args) {
//        UnsafeSequence unsafeSequence = new UnsafeSequence();
//
//        for(int i = 0; i < 10; ++i){
//            System.out.println(unsafeSequence.getNext());
//        }
//    }
//}