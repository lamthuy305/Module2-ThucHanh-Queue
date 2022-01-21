package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());  // 10
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue()); // 20
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());  // 30 40 50
        }
    }
}
