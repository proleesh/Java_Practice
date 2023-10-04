package com.proleesh.ex07;

class Complex{
    double val1;
    double val2;

    public Complex(double val1){
        this.val1 = val1;
    }
    public Complex(double val1, double val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public void print(){
        if(val2 == 0){
            System.out.println(val1 + " + " + 0.0 + "i");
        }else{
            System.out.println(val1 + " + " + val2 + "i");
        }
    }
}
public class ComplexTest {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
