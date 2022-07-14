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
        list.delete(1);
        list.display();
        list.delete(0);
        list.display();
        System.out.println(list.getSize());

        // DOUBLE LINKED LIST;
        DLL doubleList = new DLL();
        doubleList.insertHead(12);
        doubleList.insertHead(23);
        doubleList.insertHead(34);
        doubleList.insertHead(45);

        doubleList.display();
        doubleList.insertTail(12);
        doubleList.display();
        doubleList.getTail();
        doubleList.insertTail(24);
        doubleList.display();
        doubleList.getTail();
        doubleList.insertTail(34);
        doubleList.display();
        doubleList.getTail();
        doubleList.getSize();
        doubleList.insert(2,12);
        doubleList.insert(1, 1239);
        doubleList.display();
        doubleList.delete(2);
        doubleList.display();
        doubleList.delete(1 );
        doubleList.display();
        doubleList.delete(0);
        doubleList.display();
        doubleList.getValue(1);
    }
}
