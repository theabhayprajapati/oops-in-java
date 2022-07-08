package com.learn.objects.principles;

public class Inheritance {
    public static void main(String[] args) {
        Living living = new Living();
        living.breathe();
        Animal animal = new Animal(4);
        animal.breathe();
        Human human = new Human(4);
        /*print total cretures*/
        /*make sure that when us access values it's in print statement or with a variable */

        System.out.println(Living.totalCreates);
        /*as the human is an instance of Living it has all the properties of it. like totalCreates*/
        System.out.println(Human.totalCreates);
    }
}

class Living {
    static  int totalCreates = 0;
    void breathe(){
        System.out.println("Living breathe");
    };
    Living(){
        totalCreates++;
    }
}
class Animal extends Living {
    int legs;
    Animal(int legs){
        this.legs = legs;
    }
}
class Human extends Living{
    int skills;
    Human(int skills){
        this.skills = skills;
    }
}

