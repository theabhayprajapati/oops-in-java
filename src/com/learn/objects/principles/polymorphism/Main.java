package com.learn.objects.principles.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.area();
        Circle circle= new Circle();
        circle.area();
        Square square = new Square();
        square.area();
        square.total();
        /*METHOD OVERRIDING...*/
        /*  when the type of parent clas but the object is child class*/
        /*Parent obj = new Child()*/
        /*so which method can be called depends upon child class.*/
        Shapes shSquares = new Square();
        shSquares.total();
//        even though the type is Shapes the method is using is from Squares().
        // ? SO AS THE VALUES THAT CAN BE ACCESSED DEPENDS UPON THE TYPE, SO EVEN IF THE CLASS IS HAVING THE PROPERTIES
        Shapes AllSquares = new Square();
        //AllSquares.allTotal();
        //? as the allTotal is not a method of Shapes it not been accessable by ALlSquares.
        Square onSquares  = new Square();
        onSquares.allTotal(); // can be accessed by them.

    }

}
