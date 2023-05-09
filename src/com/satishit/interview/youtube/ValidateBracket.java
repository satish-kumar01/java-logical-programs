package com.satishit.interview.youtube;

import java.util.Stack;

/*Given a String s containing just the Characters '(',')','{','}','['and']',
        Determine If the Input String is Valid?
        An Input String is valid if:
        -> Open brackets must be closed by the same type of brackets.
        -> Open brackets must be closed in the Correct order.
        -> Every close bracket has a Corresponding Open bracket of the Same Type.
        Input: s = "()[]{}"
        Output: true

        Input: s = "(]"
        Output: false      */
public class ValidateBracket {
    public static void main(String[] args) {
        String s = "(]";
        boolean status = validateStringBracket(s);
        System.out.println(s);
        System.out.println(status);

    }
    public static boolean validateStringBracket(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch == '}'){
                if (stack.peek()=='{'){
                    stack.pop();
                }else {
                    return false;
                }
            } else if (ch==')') {
                if (stack.peek()=='('){
                    stack.pop();
                }else {
                    return false;
                }
            } else if (ch==']') {
                if (stack.peek()=='['){
                    stack.pop();
                }else {
                    return false;
                }
            }else {
                stack.push(ch);
            }
        }
        if (stack.size()==0){
            return true;
        }
        return false;
    }
}
