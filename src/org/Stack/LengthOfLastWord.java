package org.Stack;

import java.util.Stack;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c : s.trim().toCharArray())
        {
        	if(Character.isWhitespace(c))
        	{
        		stack.clear();
        	}
        	else
        	{
        		stack.push(c);
        	}
        }
        return stack.size();
    }
}
