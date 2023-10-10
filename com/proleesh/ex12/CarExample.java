package com.proleesh.ex12;



public class CarExample {
    public static void main(String[] args) {

        System.out.println(">>>Parameter polymorphism<<<");
        Driver driver = new Driver();
        Tire tire = new Tire();
        driver.drive(tire);

        // parameter polymorphism

        HankookTire hk = new HankookTire();
        driver.drive(hk);

        MichelinTire mt = new MichelinTire();
        driver.drive(mt);

        KumhoTire kt = new KumhoTire();
        driver.drive(kt);

        System.out.println(">>>Polymorphism<<<");
        // polymorphism
        Car myCar = new Car();


        myCar.tire = new Tire();
        myCar.run();


        myCar.tire = new MichelinTire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
