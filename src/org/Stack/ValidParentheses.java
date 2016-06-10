package org.Stack;

import java.util.Stack;

/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
 * determine if the input string is valid.
	The brackets must close in the correct order, "()" and "()[]{}" are all valid 
	but "(]" and "([)]" are not.
 */
public class ValidParentheses {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(char c : s.toCharArray()) {
            switch(c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    if(stack.isEmpty() || stack.peek() != '{') 
                    	return false;
                    else
                    	stack.pop();
                    break;
                case ')':
                	if(stack.isEmpty() || stack.peek() != '(') 
                		return false;
                	else
                    	stack.pop();
                    break;
                case ']':
                	if(stack.isEmpty() || stack.peek() != '[') 
                		return false;
                	else
                    	stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }
}
