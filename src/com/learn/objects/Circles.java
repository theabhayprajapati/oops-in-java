package com.learn.objects;

public class Circles extends Shapes{
    int sides;
    Circles(int sides){
        super(sides);
        this.sides =sides;
    }

    public static void main(String[] args) {
        Circles cirle = new Circles(10);
        System.out.println(cirle.sides);
    }
}

