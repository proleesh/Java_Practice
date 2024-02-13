package com.proleesh.ex31.test08.factory;

import com.proleesh.ex31.test08.IFactory;
import com.proleesh.ex31.test08.Operation;
import com.proleesh.ex31.test08.OperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
