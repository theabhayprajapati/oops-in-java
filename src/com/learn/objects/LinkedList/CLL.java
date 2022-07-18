package com.learn.objects.LinkedList;

public class CLL {
    private class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value = value;
        }
        Node(int value, Node next) {
            this.value = value;
            this.next = next;
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
            head= new Node(value, null);
            tail=head;
        }else {
            Node newHead = new Node(value, head);
            head=newHead;
        }
        size++;
    }
    public void insertTail(int value){
        Node newTail = new Node(value, null);
        tail.next =newTail;
        tail=newTail;
        tail.next =head;
    }
    public void getSize(){
        System.out.println(size);
    }
    public void display(){
        Node temp = head;
        if(head!=null){
            // circular linked list
            while(temp!=null){
                System.out.print(temp.value+ " -> ");
                temp = temp.next;
                if(temp ==head){
                    break;
                }
            }
        }
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
        temp.next= new Node(value, temp.next);
        size++;
    }
    public void insertRec(int index, int value){
        Rec(index, head, value);
    }
    private void Rec(int index, Node head, int value){
        if(index==1){
            Node newNode= new Node(value, head.next);
            head.next= newNode;
        }else{
            Rec(index- 1, head, value);
        }
    }

}
