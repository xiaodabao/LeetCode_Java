package org.list;

public class SortList {
	public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)
        	return head;
		
        ListNode middle = getMiddleListNode(head);
        ListNode middlenext = middle.next;
        middle.next = null;
		
		return mergeList(sortList(head),sortList(middlenext));
    }
	
	private ListNode getMiddleListNode(ListNode head)
	{
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
	}
	
	
	private ListNode mergeList(ListNode l1,ListNode l2)
	{
		ListNode newHead = new ListNode(0);
		ListNode current = newHead;
		
		while(l1 != null && l2 != null)
		{
			if(l1.val <= l2.val)
			{
				current.next = l1;
				l1 = l1.next;
			}
			else
			{
				current.next = l2;
				l2 = l2.next;
			}
			current = current.next;
		}
		
		current.next = l1 == null ? l2 : l1;
		return newHead.next;
	}
}

