package com.learn.objects.Stacks;

import java.util.Arrays;

public class CustomStack {
    private int[] stackarr;
    private int DEAFAULT_SIZE =10;
    private int size= 0;
    CustomStack(){
        this.stackarr = new int[DEAFAULT_SIZE];
    }
    private boolean isFull() {return size==this.stackarr.length;}
    public void push(int e){
            if(isFull()){
                resize();
            }
            stackarr[size++] = e;
    }
    private void resize() {
        int[] newArray = new int[stackarr.length*2];
        for(int i=0;i<stackarr.length;i++){
            newArray[i] = stackarr[i];
        }
        stackarr = newArray;
    }
    public void show(){
        System.out.println("showing stacks");
        for(int i=0;i<size;i++){
            if(i==0){
                System.out.print("[ ");
            }
            System.out.print(stackarr[i] + ", ");
            if(i==size-1){
                System.out.print("]");
            }
        }
    }
    public void pop(){
        size--;
    }


}
