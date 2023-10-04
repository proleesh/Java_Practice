package com.proleesh.ex07;

class Sklass{
    static int i;
    Sklass() {
        i += 2;
    }
}
class Oklass{
    int i;
    Oklass(){
        i += 20;
    }
}

public class PrintTest {
    public static void main(String[] args) {
        new Sklass(); new Sklass(); Sklass s = new Sklass();
        new Oklass(); new Oklass(); Oklass o = new Oklass();
        System.out.printf("s.i = %d, o.i = %d", s.i, o.i);
        System.out.println();
        System.out.println(Sklass.i);
    }
}
