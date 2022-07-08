package com.learn.objects.principles;

public class Polymorphism {
    public static void main(String[] args) {
        Cal cal = new Cal();
        cal.add(10, 20);
        cal.add(10, 20, 30);
        cal.add("Abhay", "Prajapati");

    }
}
/*this is the example of polymorphism as the name of method is same but working is different with parameer*/
/*and parameter types.*/
class Cal {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    /*string*/
    public void add(String a, String b) {
        System.out.println(a + b);
    }
}