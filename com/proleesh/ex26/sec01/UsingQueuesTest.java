package com.proleesh.ex26.sec01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class UsingQueuesTest {
    public static void main(String[] args) {
        linkedListQueue();
        arrayDeque();
    }

    public static void linkedListQueue(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.offer(2);
        queue.offer(3);
        queue.add(4);

        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
    public static void arrayDeque(){
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.add(1);
        numbers.addFirst(2);
        numbers.offerFirst(3);
        System.out.println("Head: " + numbers.getFirst() + ", Head: " + numbers.peekFirst());
        System.out.println(numbers);

        numbers.addLast(4);
        numbers.offerLast(5);

        numbers.removeFirst();
        numbers.pollFirst();
        numbers.removeLast();
        numbers.pollLast();
        System.out.println(numbers);

    }
}
