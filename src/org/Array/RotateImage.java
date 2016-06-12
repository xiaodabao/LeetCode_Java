package org.Array;

public class RotateImage {
	public void rotate(int[][] matrix) {
        int len = matrix.length;
        // origin (x,y)
        // firstPos (y,n-1-x)
        // secondPos(n-1-x,n-1-y)
        // thirdPos (n-1-y, n-1-(n-1-x)=x)
        
        for(int i=0;i<=len/2;i++)
        {
        	for(int j=i;j<len-1-i;j++)
        	{
        		int temp = matrix[i][j];
        		matrix[i][j] = matrix[len-1-j][i];
        		matrix[len-1-j][i] = matrix[len-1-i][len-1-j];
        		matrix[len-1-i][len-1-j] = matrix[j][len-1-i];
        		matrix[j][len-1-i] = temp;
        	}
        }
        
    }
}
