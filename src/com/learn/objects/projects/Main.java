package com.learn.objects.projects;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        System.out.println(list.size());
       // list.get(12);
        list.remove();
        System.out.println(list);
        System.out.println(list.size());
        list.remove();
        System.out.println(list);
        System.out.println(list.size());
        list.remove();
        System.out.println(list.size());
        list.set(5, 12);
        System.out.println(list);
        System.out.println(list.getActualLength());
    }
}
