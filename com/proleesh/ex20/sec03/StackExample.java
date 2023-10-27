package com.proleesh.ex20.sec03;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(30));
        coinBox.push(new Coin(40));

        while(!coinBox.isEmpty()){
            Coin pop = coinBox.pop();
            System.out.println("꺼낸 동전: " + pop.getValue() + "원");
        }
    }
}
