package org.Pointer;

public class SearchForARange {
	public int[] searchRange(int[] nums, int target) {
        int left = search(nums,target,0,nums.length-1,true);
        int right = search(nums,target,0,nums.length-1,false);
        return new int[]{left,right};
    }
	
	private int search(int[] nums,int target,int left,int right,boolean isLeft)
	{
		if(left > right)
			return -1;
		
		int middle = (left + right)/2;
		if(nums[middle]==target)
		{
			if(isLeft){
				int leftrange = search(nums,target,left,middle-1,isLeft);
				return leftrange == -1 ? middle : leftrange;
			}
			else
			{
				int rightrange = search(nums,target,middle+1,right,isLeft);
				return rightrange == -1 ? middle : rightrange;
			}
		}
		else if(nums[middle] > target)
		{
			return search(nums,target,left,middle-1,isLeft);
		}
		else
		{
			return search(nums,target,middle+1,right,isLeft);
		}
	}
}
