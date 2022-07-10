package com.learn.objects.principles.over;

public class OverLoading    {
    public static void main(String[] args) {
        System.out.println("this is OverLoading");
        // ? over is a method to create multiple function of same name but different implementation,(parameters);
        Loading loading = new Loading();
        Loading loading1 = new Loading("System");
        Loading loading2 = new Loading("System", "12 ");
        // System.out.println(reach.total);
    }
}


class Loading{
    Loading(String  name){
        System.out.println(name + "is loading");
    };
    Loading(){
        System.out.println("loading");
    }
    /*same method different parameter's*/
    Loading(String name, String age){
        System.out.println(name + "is " + age + " years old");
    }
}