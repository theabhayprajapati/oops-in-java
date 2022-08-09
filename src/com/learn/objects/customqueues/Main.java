package com.learn.objects.customqueues;

public class Main {
    public static void main(String[] args) {

        CustomQueues q = new CustomQueues();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.toString());
        q.dequeue();
        System.out.println("dequeue"  + q.toString());
        q.dequeue();
        System.out.println("dequeue"  + q.toString());
        q.dequeue();
        System.out.println("dequeue"  + q.toString());
        q.dequeue();
        System.out.println("dequeue"  + q.toString());
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(1);
        System.out.println("enqueue" + q.toString());
    }
}
