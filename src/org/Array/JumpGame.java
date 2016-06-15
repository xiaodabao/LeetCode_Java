package org.Array;

public class JumpGame {
	public boolean canJump(int[] nums) {
        if(nums.length == 0)
        	return false;
        
        int step = nums[0];
        
        for(int i = 1; i< nums.length; i++)
        {
        	if(step > 0)
        	{
        		step--;
        		step = Math.max(step,nums[i]);
        	}
        	else
        	{
        		return false;
        	}
        }
        return true;
        
    }
}
