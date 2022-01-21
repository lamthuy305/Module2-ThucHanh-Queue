package com.codegym;

public class MyQueue<T> {
    private class Node{
        public T data;
        public Node next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(T data){
        Node newNode = new Node(data);
        if (tail == null){
            tail = newNode;
            head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public T dequeue(){
        if (head == null){
            return null;
        }
        Node node = head;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return node.data;
    }
    public boolean isEmpty(){
        if (tail == null)
            return true;
        return false;
    }
}
