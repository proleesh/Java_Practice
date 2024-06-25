package com.proleesh.ex34.stack;

public class Stack<T> {
    // 해제한 메모리 데이터를 위한 배열 공간
    private Object[] elementData;
    // stack 에 있는 원소 갯수 계산
    private int size = 0;
    private int capacityIncrement;

    public Stack(int initialCapacity){
        elementData = new Object[initialCapacity];
    }
    public Stack(int initialCapacity, int capacityIncrement){
        this(initialCapacity);
        this.capacityIncrement = capacityIncrement;
    }
    public void push(T object){
        ensureCapacity();
        elementData[size++] = object;
    }

    public Object pop(){
        if(size == 0){
            throw new RuntimeException("Stack is empty");
        }
        Object ele = elementData[--size];
        // 마지막 원소의 레퍼런스를 제거, 메모리 누출 방지
        elementData[size] = null;
        return ele;
    }

    public int size(){
        return size;
    }

    // 배열 밑에 모든 원소가 들어올 수 있게 보증
    private void ensureCapacity(){
        if(elementData.length == size){
            Object[] oldElements = elementData;
            int newLength = 0, oldLen = elementData.length;
            if(capacityIncrement > 0){
                newLength = oldLen + capacityIncrement;
            }else{
                newLength = oldLen << 1;
            }
            elementData = new Object[newLength];
            System.arraycopy(oldElements, 0, elementData, 0, size);
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(10);
        for(var i = 0; i < 10; ++i){
            stack.push("원소: " + i);
        }
        for(var i = 0; i < 10; ++i){
            System.out.println(stack.pop());
        }
    }
}
