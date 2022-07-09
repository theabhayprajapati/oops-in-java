package com.learn.objects.packages;

import com.learn.objects.principles.reach.Range;

import static com.learn.objects.packages.Greeting.meeting;

public class Meeting  extends Range  {
    public static void main(String[] args) {
        System.out.println("this is Meeting");
        greeting();
        meeting();// from Greeting greeting methods
      //  eating(); // as this method is private, it will not be accessible from outside the class;

        Range reach = new Range();
        System.out.println(reach.totalRange );

    }

    public static void greeting() {
        System.out.println("from Meeting greeting methods");
        Meeting range = new Meeting();
        System.out.println(range.totalRange);
        System.out.println(range.subClassrange);
        /*yes it is accessible from other package's subclass*/
        //? System.out.println(range.samepkgRange);

    }
}
