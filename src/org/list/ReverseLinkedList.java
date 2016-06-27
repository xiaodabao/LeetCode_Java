package org.list;
import java.util.*;
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        /*Stack<ListNode> stack = new Stack<ListNode>();
        
        while(head != null)
        {
        	stack.push(head);
        	head = head.next;
        }
        
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(!stack.empty())
        {
        	temp.next = stack.pop();
        	temp = temp.next;
        }
        temp.next = null;
        return result.next;
        */
		
		if(head == null)
			return head;
		
		ListNode tail = head,p,q = null;
		while(tail.next!=null)
			tail = tail.next;
		
		while(head!=tail)
		{
			p=head;
			head = head.next;
			tail.next = p;
			p.next = q;
			q = p;
		}
		return tail;
    }
}
