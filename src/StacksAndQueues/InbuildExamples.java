package StacksAndQueues;

import java.util.Stack;

public class InbuildExamples {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(12);
        stack.push(6);
        stack.push(7);
        stack.push(9);
        // it is work on LIFO principle - Last in First out !!
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
