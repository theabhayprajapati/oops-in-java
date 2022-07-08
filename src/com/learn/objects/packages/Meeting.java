package com.learn.objects.packages;

import static com.learn.objects.packages.Greeting.meeting;

public class Meeting    {
    public static void main(String[] args) {
        System.out.println("this is Meeting");
        greeting();
        meeting();// from Greeting greeting methods
      //  eating(); // as this method is private, it will not be accessible from outside the class;
    }

    public static void greeting() {
        System.out.println("from Meeting greeting methods");
    }
}
