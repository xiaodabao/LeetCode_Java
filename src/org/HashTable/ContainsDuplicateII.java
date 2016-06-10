package org.HashTable;

import java.util.HashSet;

/*
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the array 
 * such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class ContainsDuplicateII {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        int start = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
        	if(!set.contains(nums[i]))
        	{
        		set.add(nums[i]);
        	}
        	else
        	{
        		return true;
        	}
        	
        	if(i - start >= k)
        	{
        		set.remove(nums[start]);
        		start++;
        	}
        }
        return false;
    }
}
