package org.list;

import java.util.HashSet;

public class LinkedListCycleII {
	public ListNode detectCycle(ListNode head) {
        /*
        HashSet<ListNode> set = new HashSet<ListNode>();
         
        
        while(head != null)
        {
        	if(!set.add(head))
        		return head;
        	head=head.next;
        }
        return null;*/
		
		if(head == null)
			return head;
		
		ListNode slow = head;
		ListNode fast = head;
		boolean isCycle = false;
		
		while(!isCycle)
		{
			if(fast.next!=null && fast.next.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			else
			{
				return null;
			}
			
			if(slow == fast)
			{
				isCycle = true;
				fast = head;
			}
		}
		
		while(fast != slow)
		{
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
    }
}
