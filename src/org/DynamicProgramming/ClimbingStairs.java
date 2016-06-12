package org.DynamicProgramming;

public class ClimbingStairs {
	public int climbStairs(int n) {
        if(n<=0)
        	return 0;
        
        int prev = 1;
        int current = 2;
        for(int i = 3;i <= n;i+=2){
        	prev = prev + current;
        	current = current + prev;
        }
        if(n%2==1)
        	return prev;
        return current;
    }
}
