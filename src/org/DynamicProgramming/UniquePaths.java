package org.DynamicProgramming;

public class UniquePaths {
	public int uniquePaths(int m, int n) {
        if(m<1 && n <1)
        	return 0;
        
        int[][] results = new int[m][n];
        
        //initial
        for(int i = 0;i<n;i++)
        {
        	results[0][i] = 1;
        }
        
        for(int i = 0; i<m;i++)
        {
        	results[i][0] = 1;
        }
        
        for(int i = 1;i<m;i++)
        {
        	for(int j = 1;j<n;j++)
        	{
        		results[i][j] = results[i-1][j] + results[i][j-1];
        	}
        }
        
        return results[m-1][n-1];
    }
}
