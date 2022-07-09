package com.learn.objects.lambaFn;

public class LamdaFn {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[1] = 12;
        arr[0] = 21;
        for (int a : arr) {
            System.out.println(a);
        }
        int a =12;
        int b =1;
        try{
            System.out.println(divide(1,0));
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(divide(121,12));
        }finally {
            System.out.println("this will finally in the results on any cases.");
        }
    }
    static  int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Please divide by two.");
        }
        return a/b;
    }
//    ? this is exam, this aeroplane
}
