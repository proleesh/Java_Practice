package com.proleesh.ex31.test04;

public class Decorator extends Component{

    protected  Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if(component != null){
            component.Operation();
        }
    }
}
