package com.learn.objects.LinkedList;

public class CLL {
    private class Node{
        private int value;
        private Node next;
        private Node previous;
        Node(int value){
            this.value = value;
        }
        Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.previous = prev;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    CLL(){
        this.size =0;
    }
    public void insertHead(int value){
        if(size==0){
            head= new Node(value, null, null);
            tail=head;
        }else {
            Node newHead = new Node(value, head,null);
            head.previous =newHead;
            head=newHead;
        }
        size++;
    }
    public void insertTail(int value){
        Node newTail = new Node(value, null, tail);
        tail.next =newTail;
        tail=newTail;
    }
    public void getSize(){
        System.out.println(size);
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println(" END ");
    }
    public void insert(int index, int value){
        if(index==0){
            insertHead(value);
            return;
        }
        if(index==size-1){
            insertTail(value);
            return;
        }
        Node temp=head;
        for(int i = 1; i<index; i++){
            temp= temp.next;
        }
        temp.next= new Node(value, temp.next,temp);
        size++;
    }
}
