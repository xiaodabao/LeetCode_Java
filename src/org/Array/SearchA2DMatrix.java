package org.Array;

public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length - 1;
        if(bottom < top)
        	return false;
        int level = 0;
        
        while(top <= bottom)
        {
        	level = (top + bottom) / 2;
        	if(matrix[level][0] == target)
        	{
        		return true;
        	}
        	else if(matrix[level][0] > target)
        	{
        		bottom = level - 1;
        	}
        	else
        	{
        		if(level == matrix.length - 1 || matrix[level + 1][0] > target)
        		{
        			break;
        		}
        		else
        		{
        			top = level + 1;
        		}
        	}
        }
        
        int left = 0;
        int right = matrix[0].length - 1;
        int middle = 0;
        while(left<=right)
        {
        	middle = (left + right) / 2;
        	if(matrix[level][middle] == target)
        	{
        		return true;
        	}
        	else if(matrix[level][middle] > target)
        	{
        		right = middle - 1;
        	}
        	else
        	{
        		left = middle + 1;
        	}
        }
        
        return false;
    }
}
