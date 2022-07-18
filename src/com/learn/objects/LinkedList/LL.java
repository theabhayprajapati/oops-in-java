package com.learn.objects.LinkedList;

public class LL {
    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    LL() {
        this.size = 0;
    }

    public void inserthead(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void inserTail(int value) {
        if (tail == null) {
            inserthead(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(" END ");
    }

    public int getSize() {
        return size;
    }

    public void insert(int index, int value) {
        if (index == 0) {
            inserthead(value);
            return;
        }
        if (index == size) {
            inserTail(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
    }

    public void delete(int index) {
        if (index == 0) {
            head = null;
            size--;
            return;
        }
        if (size == 1) {
            head = null;
            size--;
            return;
        }
        if (head == null) {
            tail = null;
            size--;
            return;
        }
        Node last = head;
        for (int i = 1; i < index; i++) {
            last = last.next;
        }
        Node temp = last.next;
        last.next = temp.next;
        size--;
    }

    public void insertRec(int index, int value) {
        head = Rec(index, head, value);
    }

    private Node Rec(int index, Node node, int value) {
        if (index == 0) {
            Node temp = new Node(value, node.next);
            return temp;
        } else {
            node.next = Rec(index - 1, node.next, value);
            return node;
        }
    }

    public void duplicates() {
        Node node = head;
        while (node.next != null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }


    public static void main(String[] args) {
        LL list1 = new LL();
        list1.inserTail(1);
        list1.inserTail(2);
        list1.inserTail(3);
        list1.inserTail(4);
        list1.display();
        LL list2 = new LL();
        list2.inserTail(2);
        list2.inserTail(4);
        list2.inserTail(5);
        list2.inserTail(6);
        list2.inserTail(8);
        list2.display();
        LL newList = new LL();
        newList.mergeList(list1, list2);
        newList.display();

    }
     public LL mergeList(LL list1, LL list2){
        Node head1 = list1.head;
        Node head2 = list2.head;
        LL newList = new LL();
        while(head1.next !=null && head2.next!=null){
            if(head1.value<head2.value){
                newList.inserTail(head1.value);
                head1 =head1.next;
            }else{
                newList.inserTail(head2.value);
                head2 = head2.next;
            }
        }
         while(head1.next !=null){
             newList.inserTail(head1.value);
             head1 = head1.next;
         }
         while(head2.next !=null){
             newList.inserTail(head2.value);
             head2 = head2.next;
         }
         newList.display();
        return newList;
     }
}

