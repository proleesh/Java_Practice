package com.proleesh.ex31.test06;

public class Pursuit implements GiveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.getName() + "에게 인형을 선물해 주었습니다.");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.getName() + "에게 꽃을 선물해 주었습니다.");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.getName() + "에게 초콜렛을 선물해 주었습니다.");
    }
}
