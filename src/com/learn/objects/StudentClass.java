package com.learn.objects;

public class StudentClass {
    public static void main(String[] args) {
        Student Abhay = new Student(232323, "Abhay Prajapati", 90);
        Abhay.id = 2323232;
        Abhay.name = "Abhay Prajapati";
        Abhay.marks = 99;
        System.out.println(Abhay.id + " " + Abhay.name + Abhay.marks);
//        this is quite repetitive right.
        Student Arin = new Student(2423424, "Arin Prajapati", 98);
        System.out.println(Arin.name);
        /*print total students*/
        /*why is this not working... : I had made a static variable in class Student; */
        /*as i was using wrong name rather totalStudent i was using totalStudents : go fixed*/

        System.out.println(Student.totalStudents);
    }

}

class Student {
    int id;
    String name;
    int marks;
    static int totalStudents = 0;
    /* so this would be repetitive we are making constructors*/
    Student(int id, String name, int marks) {
        this.id  = id;
        this.name = name;
        this.marks = marks;
        totalStudents++;
    }

}
