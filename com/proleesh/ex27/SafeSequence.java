package com.proleesh.ex27;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class SafeSequence {
    @GuardedBy("this")private int Value;

    public synchronized int getNext(){
        return Value++;
    }
}
class SafePrint{
    public static void main(String[] args) {
        SafeSequence safeSequence = new SafeSequence();
        for(int i = 0; i < 10; ++i){
            System.out.println(safeSequence.getNext());
        }
    }
}