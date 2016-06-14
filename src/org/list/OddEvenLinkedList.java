package org.list;

public class OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if(head == null)
			return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode newHead = head.next;
        
        while(even!=null && even.next!=null)
        {
        	odd.next = even.next;
        	odd = odd.next;
        	even.next = odd.next;
        	even = even.next;
        }
        
        odd.next = newHead;
        
        return head;
    }
}
