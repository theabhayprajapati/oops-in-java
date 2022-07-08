package com.learn.objects;

public class Shapes {
    int sides;
    Shapes(int side ) {
        this.sides = side;
    }

    public static void main(String[] args) {
        Shapes geo = new Shapes(12);
        System.out.println(geo.sides);
    }
}
