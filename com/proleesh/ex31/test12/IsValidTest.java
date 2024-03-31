package com.proleesh.ex31.test12;

import java.util.Stack;

public class IsValidTest {
    void main(){
        System.out.println(isValid("{}"));
        System.out.println(isValid("()"));
        System.out.println(isValid("[]"));
        System.out.println(isValid("[}"));

    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if((c == ')' && top!='(') || (c == ']' && top != '[') || (c == '}' && top != '{')){
                    return false; // Mismatched
                }
            }
        }
        return stack.isEmpty();
    }
}
