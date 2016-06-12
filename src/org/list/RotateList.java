package org.list;

public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
        	return head;
        
        int len = 0;
        ListNode current = head;
        ListNode tail = head;
        while(current!=null)
        {
        	len++;
        	tail = current;
        	current = current.next;
        }
        
        k = k%len;
        current = head;
        for(int i = 0;i<len-k-1;i++)
        {
        	current = current.next;
        }
        
        tail.next = head;
        head = current.next;
        current.next = null;
        
        return head;
    }
}
