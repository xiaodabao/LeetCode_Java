package org.Stack;

import java.util.Stack;

public class ImplementQueueUsingsStack {
	private Stack<Integer> first;
	private Stack<Integer> second;
	
	public ImplementQueueUsingsStack()
	{
		first = new Stack<Integer>();
		second = new Stack<Integer>();
	}
	// Push element x to the back of queue.
    public void push(int x) {
        while(!first.isEmpty())
        {
        	second.push(first.pop());
        }
        first.push(x);
        while(!second.isEmpty())
        {
        	first.push(second.pop());
        }
    }

    // Removes the element from in front of queue.
    public void pop() {
        first.pop();
    }

    // Get the front element.
    public int peek() {
        return first.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return first.isEmpty();
    }
}
