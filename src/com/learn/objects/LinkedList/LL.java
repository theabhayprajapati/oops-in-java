package com.learn.objects.LinkedList;

public class LL {
    private class Node{
        private int value;
        private Node next;
        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next=next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    public void inserthead(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void inserTail(int value){
        if(tail ==null){
            inserthead(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail=node;
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

    public int getSize() {
        return size;
    }
    public void insert(int index, int value){
        if(index==0){
            inserthead(value);
        }
        Node last =head;
        for(int i = 0; i<index -2; i++){
            last =head.next;
        }
        last.next= new Node(value, last.next);
        size++;
    }

}
