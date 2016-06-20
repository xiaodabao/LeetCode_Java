package org.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
	private Queue<Integer> first;
	private Queue<Integer> second;
	
	public ImplementStackUsingQueue()
	{
		first = new LinkedList<Integer>();
		second = new LinkedList<Integer>();
	}
	// Push element x onto stack.
    public void push(int x) {
        if(first.isEmpty())
        	first.add(x);
        else
        {
        	while(!first.isEmpty())
        	{
        		second.add(first.poll());
        	}
        	first.add(x);
        	while(!second.isEmpty())
        	{
        		first.add(second.poll());
        	}
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        first.poll();
    }

    // Get the top element.
    public int top() {
        return first.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return first.isEmpty();
    }
}
