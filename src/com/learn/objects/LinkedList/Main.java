package com.learn.objects.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insert(12);
        list.insert(13);
        list.insert(83);
        for(int i =0; i<=10; i++){
            list.insert(i*2);
        }
        list.display();
    }
}
