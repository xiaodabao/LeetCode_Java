package org.DynamicProgramming;

import java.util.*;
public class WordBreak {
	public boolean wordBreak(String s, Set<String> wordDict) {
        int n = s.length();
        
        boolean[] flag = new boolean[n];
        
        //找到第一个word所有可以匹配的位置
        for(int i = 0;i<n;i++)
        {
        	if(wordDict.contains(s.substring(0,i+1)))
        	{
        		flag[i] = true;
        	}
        }
        
        for(int i = 0;i < n; i++)
        {
        	if(flag[i])
        	{
        		for(int j = i+1; j < n ; j++)
        		{
        			if(wordDict.contains(s.substring(i+1,j+1)))
        			{
        				flag[j] = true;
        				if(j == n-1)
        				    return true;
        			}
        		}
        	}
        }
		
		return flag[n-1];
    }
}
