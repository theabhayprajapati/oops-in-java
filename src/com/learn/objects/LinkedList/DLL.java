package com.learn.objects.LinkedList;

public class DLL {
    private class Node{
        private int value;
        private Node next;
        private Node previous;
        Node(int value){
            this.value =value;
        }
        Node (int value, Node previous, Node Next){
            this.value =value;
            this.previous=previous;
            this.next= Next;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    DLL(){
        this.size =0;
    }
    public void insertHead(int value){
        if(size==0){
            /*Node firsthead = new Node(value);
            firsthead.previous =null;
            firsthead.next =null;*/
            head = new Node(value, null, null);
            tail= head;
        }else {
            head= new Node(value, null, head);
        }
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.println(" END ");
    }
    public void insertTail(int value){
        if(size==0){
            insertHead(value);
        }else {
            tail.next= new Node(value, tail, null);
            tail=tail.next;
            size++;
        }
    }
    public void getTail(){
        System.out.println(tail.value);
    }
    public void getHead(){
        System.out.println(head.value);
    }
    public void getSize(){
        System.out.println(size);
    }
    public void insert(int index,int value){
        // 5, 4, 3, 2, 1
        // 5,0, 4, 3,2,1
        if(size==0){
            insertHead(value);
            return;
        }
        if(index==1){
            insertHead(value);
            return;
        }
        if(index==size-1){
            insertTail(value);
            return;
        }

        Node last = head;
        for(int i=1; i<index; i++){
            System.out.println(last.value);
        }
        Node temp = last.next;
        last.next= new Node(value, last, temp);
    }
    public void delete(int index){
        if(size==1){
            head=null;
            tail= null;
        }
        if(index==0){
            deleteHead();
            return;
        }
        if(index==size-1){
            deleteTail();
            return;
        }
        Node last =head;
        for(int i=1; i<index;i++){
            last= last.next;
        }
        Node temp = last.next;
        last.next= temp.next;
        size--;
    }

    private void deleteTail() {
        tail=tail.previous;
        size--;
    }

    private void deleteHead() {
        head = head.next;
        size--;
    }
    public void getValue(int index){
        if(index==0){
            getHead();
            return;
        }
        if(index==size-1){
            getTail();
            return;
        }
        Node last =head;
        for(int i=1; i<=index;i++){
            last= last.next;
        }
        System.out.println(last.value);
    }

}
