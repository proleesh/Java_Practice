package com.proleesh.ex26.sec03;

public class GenericMethods {
    public static <T> void genericMethod(T t){
        MyGeneric<T> myGen = new MyGeneric<>(t);
        System.out.println(myGen.getInstance());
    }

    public static <T, U, V> void register(T t, U u, V v){
        Register<T, U, V> register = new Register<>(t, u, v);
        System.out.println("Register: " + register.getName() + "; " + register.getAge());
    }

    public static <T> MyGeneric<T> createGeneric(T t){
        return new MyGeneric<>(t);
    }

    public static void main(String[] args) {
        genericMethod("SK");
        genericMethod(1.1);

        register(new Dog(), "Pizza", 2);

        MyGeneric<Integer> myGen = createGeneric(4);
        System.out.println(myGen.getInstance());
    }
}
