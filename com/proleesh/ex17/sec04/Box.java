package com.proleesh.ex17.sec04;

public class Box <T>{
    public T content;

    public boolean compare(Box<T> other){
        boolean result = content.equals(other.content);
        return result;
    }
}
