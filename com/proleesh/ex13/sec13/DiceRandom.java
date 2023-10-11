package com.proleesh.ex13.sec13;

public class DiceRandom {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            int dice = (int)(Math.random() * 45) + 1;
            System.out.println(i + "번 " + dice);
        }
    }
}
