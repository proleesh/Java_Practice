package com.proleesh.ex07;

class GolfClub{
    int iron;
    String ironStr;

    public GolfClub(){
        System.out.println("7번 아이언 입니다.");
    }
    public GolfClub(int iron){
        this.iron = iron;
    }
    public GolfClub(String ironStr){
        this.ironStr = ironStr;
    }

    public void print(){
        if(iron != 0) {
            System.out.println(iron + "번 아이언 입니다.");
        }
        if(ironStr != null) {
            System.out.println(ironStr + "입니다.");
        }


    }
}
public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();
        GolfClub g2 = new GolfClub(8);
        g2.print();
        GolfClub g3 = new GolfClub("퍼터");
        g3.print();

    }
}
