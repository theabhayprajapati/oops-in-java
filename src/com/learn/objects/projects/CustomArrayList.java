package com.learn.objects.projects;

import java.util.ArrayList;

public class CustomArrayList {
    private int[] array ;
    private final int DEFAULT_SIZE =10;
    private int size =0;
    CustomArrayList(){
        this.array = new int[DEFAULT_SIZE];
    }
    private boolean isFull(){
        return size == array.length;
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        array[size++] = num;
    }
    public void set(int index, int value){
        array[index] = value;
    }

    public int getActualLength(){
        return array.length;
    }
    private void resize() {
        int[] newArray = new int[array.length*2];
        for(int i=0;i<array.length;i++){
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println(size);
    }

    public int size(){
        return size;
    }
    public int get(int index){
        return array[index];
    }
    public void remove(){
        size--;
    }
    @Override
    public String toString() {
        // add [ to the beginning of the string, and ] to the end of the string, add , between each number
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(list);
        list.size();
        list.add(11);
        list.add(12);
        list.add(13);
        System.out.println(list);
        System.out.println(list.size());
        ArrayList<Integer> list2 = new ArrayList<>(10);
        //!  <Integer>: adding type in <braces> is called as GENERICS
    }

}
