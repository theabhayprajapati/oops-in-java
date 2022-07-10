package com.learn.objects.principles.over;

public class Tasks {
    public static int totalTask = 0;
    void doTask(){
        totalTask++;
    }
    void doTask(String nameOfTask){
        System.out.println(nameOfTask + " needs to be done");
        totalTask++;
    }
    void doTask(String nameOfTask, int time){
        System.out.println(nameOfTask + " needs to be done in " + time + " hours");
        totalTask++;
    }
    void doTask(String nameOfTask, int time, String nameOfPerson){
        System.out.println(nameOfTask + " needs to be done in " + time + " hours by " + nameOfPerson);
        totalTask++;
    }
    void doTask(String nameOfTask, int time, String nameOfPerson, String nameOfCompany){
        System.out.println(nameOfTask + " needs to be done in " + time + " hours by " + nameOfPerson + " at " + nameOfCompany);
        totalTask++;
    }

    public static void main(String[] args) {
        Tasks task = new Tasks();
        task.doTask();
        task.doTask("Make Tea");
        task.doTask("Learn more about Computers", 2);
        task.doTask("Start a Business", 3, "Abhay");
        task.doTask("Meet with People for new Projects", 4, "Sunder Pichai", "Google");
        System.out.println("total tasks are " + Tasks.totalTask);
    }
}


