package com.learn.objects.LinkedList;

public class CircularMain {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insertHead(5);
        list.insertHead(4);
        list.getSize();
        list.insertTail(3);
        list.getSize();
        list.display();
        list.insert(3,20);
        list.display();
    }
}
