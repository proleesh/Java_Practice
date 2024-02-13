package com.proleesh.ex31.test08;

import com.proleesh.ex31.test08.Operation;

public class OperationSub extends Operation {
    @Override
    double getResult() {
        if(numberA > numberB){
            return numberA - numberB;
        }else{
            return numberB - numberA;
        }
    }
}
