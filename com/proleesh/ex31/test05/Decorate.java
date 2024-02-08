package com.proleesh.ex31.test05;

public class Decorate extends Person{

    protected Person component;

    public void setComponent(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if(component != null){
            component.show();
        }
    }
}
