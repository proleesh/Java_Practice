package com.proleesh.ex31.test13.sealedtest2;

public sealed interface SomeService permits SomeServiceImpl, SomeServiceImpl2 {
    void doSomething();
}
