package com.proleesh.ex34.nodetest;

class Node{
    Node next;
    String name;
    public Node(String name) {
        this.name = name;
    }
}
public class NodeTest {
    public static void main(String[] args) {
        Node n1 = new Node("첫번째 노드");
        Node n2 = new Node("두번째 노드");
        Node n3 = new Node("세번째 노드");
        n1.next = n2;
        n3 = n2;
        n2 = null;
    }
}
