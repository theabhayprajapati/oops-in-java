package com.learn.objects.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.inserthead(12);
        list.inserthead(13);
        list.inserthead(83);
        list.display();
        System.out.println(list.getSize());
        list.insert(2, 2);
        list.display();
        System.out.println(list.getSize());
    }
}
