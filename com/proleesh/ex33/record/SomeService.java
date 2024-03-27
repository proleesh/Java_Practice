package com.proleesh.ex33.record;

/**
 * @author sunghyuklee
 * @since 21
 */
public class SomeService {
    public boolean isEligible(Object o) {
        if (o instanceof Person(String name, Integer age)) {
            if(age > 18){
                return true;
            }else{
                throw new RuntimeException("Because of age smaller than 18");
            }

        }
        return false;

    }
    void main(){
        Person tom = new Person("Tom", 23);
        SomeService ss = new SomeService();
        System.out.println(ss.isEligible(tom));

        Person peter = new Person("Peter", 15);
        System.out.println(ss.isEligible(peter));
    }
}
