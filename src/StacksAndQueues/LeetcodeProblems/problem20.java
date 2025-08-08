package StacksAndQueues.LeetcodeProblems;

import java.util.Stack;

public class problem20 {
    public static void main(String[] args) {
        System.out.println(isValid("[]()"));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                if(ch == ')'){
                    if(stack.peek() != '(' || stack.isEmpty()){
                        return false;
                    }
                }if(ch == ']'){
                    if(stack.peek() != '[' || stack.isEmpty()){
                        return false;
                    }
                }if(ch == '}'){
                    if(stack.peek() != '{' || stack.isEmpty()){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
