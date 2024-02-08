package com.proleesh.ex31.test05;

public class TestMain {
    public static void main(String[] args) {
        Person aaa = new Person("aaa");
        System.out.println("첫 번째 코디: ");

        TShirts tshirts = new TShirts();
        Cardigan cardigan = new Cardigan();
        Coat coat = new Coat();

        tshirts.setComponent(aaa);
        cardigan.setComponent(tshirts);
        coat.setComponent(cardigan);
        coat.show();

        System.out.println("\n두 번째 코디: ");

        Person bbb = new Person("bbb");

        Cardigan cardigan2 = new Cardigan();
        Coat coat2 = new Coat();

        cardigan2.setComponent(bbb);
        coat2.setComponent(cardigan2);
        coat2.show();



    }
}
