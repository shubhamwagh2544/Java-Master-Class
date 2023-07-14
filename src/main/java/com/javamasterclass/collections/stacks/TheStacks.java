package com.javamasterclass.collections.stacks;

import java.util.Stack;

public class TheStacks {
    /*
            What is stack :
            : Last In First Out (LIFO) stack of objects
            : extends vector to allow vector to act as Stack
            : push : pop : peek : empty : search
     */
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("blue");
        stack.push("green");
        stack.push("red");

        System.out.println(stack.peek());       // LI
        System.out.println(stack.pop());        // FO
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

        stack.push("s");
        stack.push("r");
        stack.push("w");

        System.out.println(stack.search("w"));      //1: returns 1-based position of object o from top element of stack
        System.out.println(stack.search("s"));      //3
        System.out.println(stack.search("M"));      //-1

        //stack extends vector which extends AbstractList which implements List
        stack.add("new");                               // we can call add() of List on stack
        System.out.println(stack.peek());
    }
}
