package com.learn.objects.principles.over;
/*what is think about @Override is that is helps us to know if we are overriding a method of not.*/
public class OverRiding extends Tasks{
    @Override
    /*this method is successfully override*/
    void doTask() {
        System.out.println("i am in OverRiding");
    }
    /*if will only override if the name and parameters are equal.*/
    // ! which means the method signature should be same.
    void doTask2() {
        System.out.println("i am in OverRiding");
    }
    public static void main(String[] args) {
        OverRiding overRiding = new OverRiding();
        overRiding.doTask();
    }
}
