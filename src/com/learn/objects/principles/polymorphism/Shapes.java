package com.learn.objects.principles.polymorphism;

public class Shapes {
    void area() {
        System.out.println("i am in shapes");
    }

    private static int total = 0;

    void total() {
        System.out.println(total + " the total values");
    }
    Shapes(){
        total++;
    }

    @Override
    public String toString(){
        return "I have overridden toString";
    }
}
