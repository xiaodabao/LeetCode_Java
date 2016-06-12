package org.Pointer;

public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left<right)
        {
        	if(left>0 && height[left] < height[left-1])
        	{
        		left++;
        		continue;
        	}
        	if(right < height.length - 1 && height[right]<height[right+1])
        	{
        		right--;
        		continue;
        	}
        	int currentarea = Math.min(height[left], height[right]) * (right-left);
        	result = Math.max(result,currentarea);
        	if(height[left]<=height[right])
        	{
        		left++;
        	}
        	else{
        		right--;
        	}
        }
        
        return result;
    }
}
