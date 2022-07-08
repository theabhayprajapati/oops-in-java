package com.learn.objects.packages;

import static com.learn.objects.packages.Meeting.greeting;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("this is Greeting");
        greeting();
    }
    public static  void meeting() {
        System.out.println("from Greeting greeting methods");
    }
    private static void eating() {
        System.out.println("from Greeting eating methods");
    }
}
