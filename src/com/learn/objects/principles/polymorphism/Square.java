package com.learn.objects.principles.polymorphism;

import javax.swing.*;

public class Square extends  Shapes{
    void area(){
        System.out.println("i amin square");
    }
    private  static int total=0;
    void total (){
        System.out.println(total+ " the total for Squares");
    }
    Square(){
        total++;
    }
    void allTotal(){
        System.out.println(" the all total values of shapes is "+ total);
    }
}
