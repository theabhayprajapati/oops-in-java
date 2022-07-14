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
    LL(){
        this.size =0;
    }
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
            return;
        }
        if(index==size){
            inserTail(value);
            return;
        }
        Node temp =head;
        for(int i=1; i<index;i++){
            temp=temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next=node;
    }
    public void delete(int index){
        if(index==0){
            head=null;
        }
        if(size==1){
            head=null;
            return;
        }
        if(head==null){
            tail=null;
            return;
        }
        Node last=head;
        for(int i=1;i<index;i++){
            last = last.next;
        }
        Node temp = last.next;
        last.next=temp.next;
    }
}
