package com.learn.objects.customqueues;

import java.util.Arrays;

public class CustomQueues {
    private int[] arr;
    private int DEFAULT_SIZE =10;
    private int size =0;
    CustomQueues(){
        this.arr = new int[DEFAULT_SIZE];
    }
    private boolean isFull(){
        return size == arr.length;
    }
    public void enqueue(int e){
        if(isFull()){
            resize();
        }
        arr[size++] = e;
    }
    private void resize(){
        int[] fakearr = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i];
        }
        arr = fakearr;
    }
    @Override
    public String toString() {
        // add [ to the beginning of the string, and ] to the end of the string, add , between each number
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void dequeue(){
        if(size<=0){
            System.out.println("[0]");
        }else{
            int[] dequeuearr = new int[arr.length];
            for (int i =0; i<size; i++){
                dequeuearr[i]= arr[i+1];
            }
            arr =dequeuearr;
            size--;
        }
    }

}
