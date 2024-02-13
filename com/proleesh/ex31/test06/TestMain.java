package com.proleesh.ex31.test06;

public class TestMain {
    public static void main(String[] args) {
        SchoolGirl sky = new SchoolGirl();
        sky.setName("하늘");

        Proxy human = new Proxy(sky);

        human.GiveDolls();
        human.GiveFlowers();
        human.GiveChocolate();

    }
}
