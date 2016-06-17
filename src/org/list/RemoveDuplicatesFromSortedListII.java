package org.list;

public class RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        
        ListNode p1 = newHead;
        ListNode p2 = head;
        
        while(p2!=null)
        {
        	boolean isdup = false;
        	while(p2.next != null && p2.val == p2.next.val)
        	{
        		isdup = true;
        		p2 = p2.next;
        	}
        	
        	if(isdup)
        	{
        		p2 = p2.next;
        		continue;
        	}
        	
        	p1.next = p2;
        	p1 = p1.next;
        	p2 = p2.next;
        }
        p1.next = p2;
        return newHead.next;
        
    }
}
