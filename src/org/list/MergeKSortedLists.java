package org.list;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(10,new Comparator<ListNode>(){
        	@Override
        	public int compare(ListNode n1,ListNode n2)
        	{
        		return n1.val-n2.val;
        	}
        });
        
        //Initial
        for(ListNode item : lists)
        {
        	if(item != null)
        		heap.add(item);
        }
        
        ListNode result = new ListNode(0);
        ListNode current = result;
        
        while(!heap.isEmpty())
        {
        	ListNode temp = heap.poll();
        	
        	current.next = temp;
        	current = temp;
        	if(temp.next!=null)
        	{
        		heap.add(temp.next);
        	}
        }
        return result.next;
    }
}
