package org.HashTable;

import java.util.HashSet;

/*
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {
	public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        while(n!=1 && !set.contains(n))
        {
        	set.add(n);
        	n = sum(n);
        }
        
        return n == 1;
    }
	
	private int sum(int num)
	{
		int result = 0;
		while(num>0)
		{
			result += Math.pow(num % 10, 2);
			num = num/10;
		}
		return result;
	}
}
