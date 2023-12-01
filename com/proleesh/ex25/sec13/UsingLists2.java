package com.proleesh.ex25.sec13;

import java.util.LinkedList;
import java.util.Stack;

public class UsingLists2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Andrea");
        stack.push("Barbara");
        stack.push("Caroline");
        System.out.println(stack);

        System.out.println("Top of stack: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        stack.push("Helen");
        System.out.println(stack);

        linkedList();
    }
    public static void linkedList(){
        LinkedList<String> names = new LinkedList<>();
        names.add("Colin");
        names.add("David");
        names.addFirst("Brian");
        names.addLast("Edward");
        System.out.println(names);

        names.remove("David");
        names.removeFirst();
        names.removeLast();
        System.out.println(names);
    }
}
