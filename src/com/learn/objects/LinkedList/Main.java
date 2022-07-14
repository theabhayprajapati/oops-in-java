package com.learn.objects.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.inserthead(12);
        System.out.println(list.getSize());

        list.inserthead(13);
        System.out.println(list.getSize());
        list.inserthead(83);
        System.out.println(list.getSize());
        list.display();
        System.out.println(list.getSize());
        list.insert(2, 2);
        list.display();
        System.out.println(list.getSize());
        list.delete(2);
        list.display();
        list.delete(2);
        list.display();
        list.delete(1);
        list.display();
        list.delete(0);
        list.display();
    }
}
