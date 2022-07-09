package com.learn.objects.LinkedList;

public class LL {
    private class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void insert(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println(" END ");
    }
}
