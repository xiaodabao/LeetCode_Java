package org.list;

public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        int left = 0;
        int right = 0;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode leftNode = newHead;
        ListNode rightNode = head;
        while(rightNode != null)
        {
        	right++;
        	rightNode = rightNode.next;
        	
        	if(right - left > n)
        	{
        		left++;
        		leftNode = leftNode.next;
        	}
        }
        
        if(right-left == n && leftNode.next != null)
        	leftNode.next = leftNode.next.next;
        return newHead.next;
    }
}
