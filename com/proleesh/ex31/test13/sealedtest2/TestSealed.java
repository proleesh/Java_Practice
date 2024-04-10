package com.proleesh.ex31.test13.sealedtest2;

public class TestSealed {
    void main(){
        SomeService service = new SomeServiceImpl();
        service.doSomething();

        SomeService service2 = new SomeServiceImpl2();
        service2.doSomething();

    }
}
