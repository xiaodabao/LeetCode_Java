package org.Stack;

import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
        String[] strs = path.split("/");
        
        Stack<String> stack = new Stack<String>();
        
        for(String s : strs)
        {
        	switch(s)
        	{
	        	case ".":
	        		break;
	        	case "..":
	        		if(stack.empty())
	        			//stack.push(s);
	        			continue;
	        		else
	        			stack.pop();
	        		break;
	        	case "":
	        		break;
				default:
					stack.push(s);
        	}
        }
        
        String result = "";
        while(!stack.empty())
        {
        	result = "/" + stack.pop() + result;
        }
        
        return result.isEmpty() ? "/" : result;
    }
}
