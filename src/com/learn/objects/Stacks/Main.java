package com.learn.objects.Stacks;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        System.out.println("this is custom stack");
        stack.push(12);
        stack.show();
        stack.push(1);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.show();
        stack.pop();
        stack.show();
        stack.push(132123);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
    }
}
