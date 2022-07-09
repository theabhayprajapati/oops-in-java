package com.learn.objects.principles.Encapsulatoin;

import com.learn.objects.principles.reach.Range;

public class Main {
    public static void main(String[] args) {
        System.out.println("this is Encap");
        System.out.println("here the value of variables are hidden");
        Range reach= new Range();
        System.out.println(reach.totalRange);
        // System.out.println(reach.total);
    }
}