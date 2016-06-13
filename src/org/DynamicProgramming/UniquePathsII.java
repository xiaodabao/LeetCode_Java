package org.DynamicProgramming;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
		int height = obstacleGrid.length;
		if(height == 0)
			return 0;
		int width = obstacleGrid[0].length;
		if(width == 0)
			return 0;
		int[][] results = new int[height][width];
		
		//initial
		results[0][0] = obstacleGrid[0][0] ^ 1;
		for(int i = 1; i < width;i++)
		{
			if(obstacleGrid[0][i] == 1)
				results[0][i] = 0;
			else
				results[0][i] = results[0][i-1];
		}
		
		for(int i = 1; i< height; i++)
		{
			if(obstacleGrid[i][0] == 1)
				results[i][0] = 0;
			else
				results[i][0] = results[i-1][0];
		}
		
		//calc
		for(int i = 1; i < height; i++)
		{
			for(int j = 1; j < width; j++)
			{
				if(obstacleGrid[i][j] == 1)
					results[i][j] = 0;
				else
					results[i][j] = results[i-1][j] + results[i][j-1];
			}
		}
		return results[height-1][width-1];
    }
}
