package org.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

	    int n = nums.length;
	    if(n < 3) return result;

	    Arrays.sort(nums);

	    int i = 0;

	    while(i < n - 2)
	    {
	        int start = i + 1, end = n - 1;
	        while(start < end)
	        {
	            int sum = nums[i] + nums[start] + nums[end];
	            if(sum == 0)
	            {
	                result.add(Arrays.asList(nums[i], nums[start], nums[end]));
	                do
	                {
	                    end--;
	                }while(end > start && nums[end] == nums[end + 1]);
	                do
	                {
	                    start++;
	                }while(start < end && nums[start] == nums[start - 1]);
	            }
	            else if(sum > 0)
	            {
	                do
	                {
	                    end--;
	                }while(end > start && nums[end] == nums[end + 1]);
	            }
	            else
	            {
	                do
	                {
	                    start++;
	                }while(start < end && nums[start] == nums[start - 1]);
	            }
	        }
	        do
	        {
	            i++;
	        }while(i < n - 2 && nums[i] == nums[i - 1]);
	    }

	    return result;
    }
}
