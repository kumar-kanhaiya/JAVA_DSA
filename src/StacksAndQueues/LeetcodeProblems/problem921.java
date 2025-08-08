package StacksAndQueues.LeetcodeProblems;

import java.util.Stack;

public class problem921 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("((("));

    }
//    public static int minAddToMakeValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for(char ch : s.toCharArray()) {
//            if (ch == '(' || ch == '{' || ch == '[') {
//                stack.push(ch);
//            } else {
//                if (ch == ')') {
//                    if (!stack.isEmpty() && stack.peek() == '(') {
//                        stack.pop();
//                    }
//
//                }
//                if (ch == ']') {
//                    if (!stack.isEmpty() && stack.peek() == '[') {
//                        stack.pop();
//                    }
//                }
//                if (ch == '}') {
//                    if (!stack.isEmpty() && stack.peek() == '{') {
//                        stack.pop();
//                    }
//                }
//            }
//        }
//        return stack.size();
//        }
    public static int minAddToMakeValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.size();
    }


    }

