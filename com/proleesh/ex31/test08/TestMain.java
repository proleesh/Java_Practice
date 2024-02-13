package com.proleesh.ex31.test08;

import com.proleesh.ex31.test08.factory.AddFactory;
import com.proleesh.ex31.test08.factory.DivFactory;
import com.proleesh.ex31.test08.factory.MulFactory;
import com.proleesh.ex31.test08.factory.SubFactory;

public class TestMain {
    public static void main(String[] args) {
        IFactory opFac = new AddFactory();
        Operation operation = opFac.createOperation();
        operation.numberA = 100;
        operation.numberB = 200;
        System.out.println("numberA + numberB = " + operation.getResult());

        IFactory subFac = new SubFactory();
        Operation operation1 = subFac.createOperation();
        operation1.numberA = 100;
        operation1.numberB = 200;
        System.out.println("numberB - numberA = " + operation1.getResult());

        IFactory mulFac = new MulFactory();
        Operation operation2 = mulFac.createOperation();
        operation2.numberA = 100;
        operation2.numberB = 200;
        System.out.println("numberA * numberB = " + operation2.getResult());

        IFactory divFac = new DivFactory();
        Operation operation3 = divFac.createOperation();
        operation3.numberA = 100;
        operation3.numberB = 200;
        System.out.println("numberB / numberA = " + operation3.getResult());
    }
}
