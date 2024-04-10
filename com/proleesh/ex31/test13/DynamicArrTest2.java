package com.proleesh.ex31.test13;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * @author sunghyuklee
 * @param <E>
 */
public class DynamicArrTest2<E> {
    // save array for truth data
    private E[] data;
    // record current element
    private int size;
    // default initialize size
    private static final int INIT_CAP = 1;

    public DynamicArrTest2() {
        this(INIT_CAP);
    }

    public DynamicArrTest2(int initialCapacity) {
        data = (E[]) new Object[initialCapacity];
        size = 0;
    }

    // add
    public void addLast(E e){
        int cap = data.length;
        // data array size check
        if(size == cap){
            resize(2 * cap);
        }
        // insert element on rear
        data[size++] = e;
    }

    public void add(int index, E e){
        checkPositionIndex(index);

        int cap = data.length;

        if(size == cap){
            resize(2 * cap);
        }

        for(int i = size-1; i >= index; i--){
            data[i+1] = data[i];
        }

        data[index] = e;

        size++;
    }

    public void addFirst(E e){
        add(0, e);
    }
    public E removeLast(){
        if(size == 0){
            throw new NoSuchElementException();
        }
        int cap = data.length;

        if(size == cap / 4){
            resize(cap / 2);
        }

        E deletedVal = data[size - 1];

        data[size - 1] = null;
        size--;

        return deletedVal;
    }
    public E remove(int index){
        checkElementIndex(index);

        int cap = data.length;
        if(size == cap / 4){
            resize(cap / 2);
        }

        E deletedVal = data[index];

        for(int i = index + 1; i < size; i++){
            data[i - 1] = data[i];
        }

        data[size - 1] = null;
        size--;

        return deletedVal;
    }

    public E removeFirst(){
        return remove(0);
    }

    // search
    public E get(int index){
        checkElementIndex(index);

        return data[index];
    }

    public E set(int index, E e){
        checkElementIndex(index);

        E old = data[index];
        data[index] = e;
        return old;
    }

    // tool method
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private boolean isElementIndex(int index){
        return index >= 0 && index < size;
    }

    private boolean isPositionIndex(int index){
        return index >= 0 && index <= size;
    }

    private void checkElementIndex(int index){
        if(!isElementIndex(index)){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkPositionIndex(int index){
        if(!isPositionIndex(index)){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void display(){
        System.out.println("size = " + size + ", capacity = " + data.length);
        System.out.println(Arrays.toString(data));
    }

    private void resize(int newCap){
        if(size > newCap){
            return;
        }
        E[] temp = (E[]) new Object[newCap];

        for(int i = 0; i < size; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    void main(){
        DynamicArrTest2<Integer> arr = new DynamicArrTest2<>();

        for(int i = 1; i <= 5; ++i){
            arr.addLast(i);
        }

        arr.remove(3);
        arr.add(1, 9);
        arr.addFirst(100);
        int val = arr.removeLast();

        for(int i = 0; i < arr.size(); ++i){
            System.out.print(arr.get(i) + " ");
        }
    }

}
